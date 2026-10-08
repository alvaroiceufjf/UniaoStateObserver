package org.example;


public class EstadoEmAnalise extends PropostaCreditoEstado {
    private static EstadoEmAnalise instance = new EstadoEmAnalise();
    private EstadoEmAnalise() {}
    public static EstadoEmAnalise getInstance() { return instance; }

    public String getEstado() { return "Em Análise"; }

    @Override
    public boolean aprovar(PropostaCredito proposta) {
        proposta.setEstado(EstadoAprovada.getInstance());
        return true;
    }
}