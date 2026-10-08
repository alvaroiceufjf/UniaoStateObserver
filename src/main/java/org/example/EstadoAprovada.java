package org.example;


public class EstadoAprovada extends PropostaCreditoEstado {
    private static EstadoAprovada instance = new EstadoAprovada();
    private EstadoAprovada() {}
    public static EstadoAprovada getInstance() { return instance; }

    public String getEstado() { return "Aprovada"; }

    @Override
    public boolean efetivar(PropostaCredito proposta) {
        proposta.setEstado(EstadoEfetivada.getInstance());
        return true;
    }
}