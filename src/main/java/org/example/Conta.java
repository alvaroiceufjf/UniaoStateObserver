package org.example;

import java.util.Observable;

public class Conta extends Observable {

    private Integer numero;
    private String codCoop;
    private String numPA;

    public Conta(Integer numero, String codCoop, String numPA) {
        this.numero = numero;
        this.codCoop = codCoop;
        this.numPA = numPA;
    }

    public void lancarRendimento() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", codCoop='" + codCoop + '\'' +
                ", numPA='" + numPA + '\'' +
                '}';
    }
}
