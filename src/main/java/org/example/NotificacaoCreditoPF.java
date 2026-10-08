package org.example;

public class NotificacaoCreditoPF extends Notificacao {
    public NotificacaoCreditoPF(CanalEnvio canal) { super(canal); }
    public String enviar(String mensagem) { return canal.enviarMensagem("Status Crédito PF", mensagem); }
}
