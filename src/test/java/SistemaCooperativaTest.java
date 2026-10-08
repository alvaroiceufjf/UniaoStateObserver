package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SistemaCooperativaTest {

    @BeforeEach
    void setUp() {
        // Configura dados do Singleton de sessão
        Dados.getInstance().setCodCoop("4402");
        Dados.getInstance().setNumPA("05");
    }

    @Test
    void deveExecutarFluxoCompletoParaPessoaFisicaComEmail() {
        PropostaCredito proposta = new PropostaCredito("PROP-101");
        Associado associado = new Associado("João Silva");

        FabricaAbstrata fabricaPF = new FabricaPessoaFisica();
        ProcessadorNotificacao processadorPF = new ProcessadorNotificacaoPF();
        CanalEnvio canalEmail = new CanalEmail();

        GerenteNegocio gerente = new GerenteNegocio(fabricaPF, processadorPF);

        String resultado = gerente.processarAprovacao(proposta, associado, canalEmail);

        // Valida State + Observer
        assertEquals("Aprovada", proposta.getNomeEstado());
        assertEquals("João Silva, sua proposta mudou para o estado: Aprovada", associado.getUltimaNotificacao());

        // Valida Saída Integrada
        String esperado = "Contrato Crédito PF [Coop 4402] | " +
                "Relatório Análise Risco PF | " +
                "E-mail [Status Crédito PF]: João Silva, sua proposta mudou para o estado: Aprovada";

        assertEquals(esperado, resultado);
    }

    @Test
    void deveExecutarFluxoCompletoParaAgroComWhatsApp() {
        PropostaCredito proposta = new PropostaCredito("PROP-AGRO-200");
        Associado associado = new Associado("Fazenda Santa Luzia");

        FabricaAbstrata fabricaAgro = new FabricaAgro();
        ProcessadorNotificacao processadorAgro = new ProcessadorNotificacaoAgro();
        CanalEnvio canalWhats = new CanalWhatsApp();

        GerenteNegocio gerente = new GerenteNegocio(fabricaAgro, processadorAgro);

        String resultado = gerente.processarAprovacao(proposta, associado, canalWhats);

        // Valida State + Observer
        assertEquals("Aprovada", proposta.getNomeEstado());
        assertEquals("Fazenda Santa Luzia, sua proposta mudou para o estado: Aprovada", associado.getUltimaNotificacao());

        // Valida Saída Integrada
        String esperado = "Cédula Rural Agro [Coop 4402] | " +
                "Relatório Vistoria Safra | " +
                "WhatsApp [Status Crédito Agro]: Fazenda Santa Luzia, sua proposta mudou para o estado: Aprovada";

        assertEquals(esperado, resultado);
    }
}