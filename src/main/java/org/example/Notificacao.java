package org.example;

public abstract class Notificacao {
    protected CanalEnvio canal;
    public Notificacao(CanalEnvio canal) { this.canal = canal; }
    public abstract String enviar(String mensagem);
}
