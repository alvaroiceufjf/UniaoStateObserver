package org.example;

import java.util.Observable;
import java.util.Observer;

public class Associado implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public Associado(String nome) { this.nome = nome; }

    public String getUltimaNotificacao() { return ultimaNotificacao; }

    public void vincularProposta(PropostaCredito proposta) {
        proposta.addObserver(this);
    }

    @Override
    public void update(Observable proposta, Object arg) {
        PropostaCredito p = (PropostaCredito) proposta;
        this.ultimaNotificacao = nome + ", sua proposta mudou para o estado: " + p.getNomeEstado();
    }
}