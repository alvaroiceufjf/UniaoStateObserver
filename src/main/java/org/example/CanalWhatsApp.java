package org.example;

public class CanalWhatsApp implements CanalEnvio {
    public String enviarMensagem(String t, String c) { return "WhatsApp [" + t + "]: " + c; }
}
