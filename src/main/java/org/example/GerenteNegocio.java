package org.example;


public class GerenteNegocio {

    private FabricaAbstrata fabricaDocumentos;
    private ProcessadorNotificacao processadorNotificacao;

    public GerenteNegocio(FabricaAbstrata fabricaDocumentos, ProcessadorNotificacao processadorNotificacao) {
        this.fabricaDocumentos = fabricaDocumentos;
        this.processadorNotificacao = processadorNotificacao;
    }

    public String processarAprovacao(PropostaCredito proposta, Associado associado, CanalEnvio canal) {
        // 1. Observer: Vincula o associado à proposta
        associado.vincularProposta(proposta);

        // 2. State: Transiciona o estado da proposta (que notifica o Observer automaticamente)
        boolean aprovou = proposta.aprovar();

        if (!aprovou) {
            return "Falha ao aprovar proposta";
        }

        // 3. Abstract Factory: Emite os documentos necessários
        Contrato contrato = fabricaDocumentos.createContrato();
        Relatorio relatorio = fabricaDocumentos.createRelatorio();

        // 4. Factory Method + Bridge: Envia a notificação do status
        String notificacaoEnvio = processadorNotificacao.notificar(canal, associado.getUltimaNotificacao());

        return contrato.emitir() + " | " + relatorio.emitir() + " | " + notificacaoEnvio;
    }
}
