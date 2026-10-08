package org.example;

public abstract class ProcessadorNotificacao {
    protected abstract Notificacao criarNotificacao(CanalEnvio canal);

    public String notificar(CanalEnvio canal, String mensagem) {
        Notificacao notificacao = criarNotificacao(canal);
        return notificacao.enviar(mensagem);
    }
}
