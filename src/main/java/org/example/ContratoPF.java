package org.example;

public class ContratoPF implements Contrato {
    public String emitir() { return "Contrato Crédito PF [Coop " + Dados.getInstance().getCodCoop() + "]"; }
}
