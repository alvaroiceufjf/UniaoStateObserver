package org.example;

public class FabricaAgro implements FabricaAbstrata {
    public Contrato createContrato() { return new ContratoAgro(); }
    public Relatorio createRelatorio() { return new RelatorioAgro(); }
}
