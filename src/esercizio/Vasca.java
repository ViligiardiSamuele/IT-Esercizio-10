package esercizio;

public class Vasca {
    private String nome;
    private double volume, contenuto;

    public Vasca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getContenuto() {
        return contenuto;
    }

    public void aggiungiContenuto(double contenuto) {
        if(this.contenuto+contenuto <= volume) this.contenuto = contenuto;
    }

    public void prelevaContenuto(double contenuto) {
        if(this.contenuto-contenuto >= 0) this.contenuto -= contenuto;
    }
}