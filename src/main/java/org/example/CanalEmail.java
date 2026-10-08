package org.example;

public class CanalEmail implements CanalEnvio {
    public String enviarMensagem(String t, String c) { return "E-mail [" + t + "]: " + c; }
}
