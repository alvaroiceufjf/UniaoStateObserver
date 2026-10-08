package org.example;

public class EstadoEfetivada extends PropostaCreditoEstado {
    private static EstadoEfetivada instance = new EstadoEfetivada();
    private EstadoEfetivada() {}
    public static EstadoEfetivada getInstance() { return instance; }

    public String getEstado() { return "Efetivada"; }
}