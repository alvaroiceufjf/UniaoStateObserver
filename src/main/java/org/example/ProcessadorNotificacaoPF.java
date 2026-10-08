package org.example;

public class ProcessadorNotificacaoPF extends ProcessadorNotificacao {
    protected Notificacao criarNotificacao(CanalEnvio canal) { return new NotificacaoCreditoPF(canal); }
}
