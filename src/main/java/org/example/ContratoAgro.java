package org.example;

public class ContratoAgro implements Contrato {
    public String emitir() { return "Cédula Rural Agro [Coop " + Dados.getInstance().getCodCoop() + "]"; }
}
