package org.example;

public abstract class PropostaCreditoEstado {
    public abstract String getEstado();
    public boolean aprovar(PropostaCredito proposta) { return false; }
    public boolean efetivar(PropostaCredito proposta) { return false; }
}