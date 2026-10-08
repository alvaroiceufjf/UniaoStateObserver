package org.example;
import java.util.Observable;
import java.util.Observer;
public class PropostaCredito extends Observable {
    private String numero;
    private PropostaCreditoEstado estado;

    public PropostaCredito(String numero) {
        this.numero = numero;
        this.estado = EstadoEmAnalise.getInstance();
    }

    public void setEstado(PropostaCreditoEstado estado) {
        this.estado = estado;
        setChanged();
        notifyObservers(); // Dispara atualização para os Observers (Associados)
    }

    public boolean aprovar() { return estado.aprovar(this); }
    public boolean efetivar() { return estado.efetivar(this); }

    public String getNomeEstado() { return estado.getEstado(); }
    public String getNumero() { return numero; }
}