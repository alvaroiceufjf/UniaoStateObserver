package org.example;

public class FabricaPessoaFisica implements FabricaAbstrata {
    public Contrato createContrato() { return new ContratoPF(); }
    public Relatorio createRelatorio() { return new RelatorioPF(); }
}
