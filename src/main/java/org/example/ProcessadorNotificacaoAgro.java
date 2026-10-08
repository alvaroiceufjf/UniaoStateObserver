package org.example;

public class ProcessadorNotificacaoAgro extends ProcessadorNotificacao {
    protected Notificacao criarNotificacao(CanalEnvio canal) { return new NotificacaoCreditoAgro(canal); }
}
