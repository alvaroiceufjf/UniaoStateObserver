package org.example;

public class NotificacaoCreditoAgro extends Notificacao {
    public NotificacaoCreditoAgro(CanalEnvio canal) { super(canal); }
    public String enviar(String mensagem) { return canal.enviarMensagem("Status Crédito Agro", mensagem); }
}
