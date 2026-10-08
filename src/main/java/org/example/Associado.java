package org.example;

import java.util.Observable;
import java.util.Observer;

public class Associado implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Associado(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void vincularConta(Conta conta) {
        conta.addObserver(this);
    }

    @Override
    public void update(Observable conta, Object arg1) {
        this.ultimaNotificacao = this.nome + ", nova movimentação lançada na " + conta.toString();
    }
}