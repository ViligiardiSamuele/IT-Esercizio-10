package esercizio;

public class VascaTipoB extends Vasca{
    public VascaTipoB(String nome, double larghezza, double lunghezza, double altezza) {
        super(nome);
        this.setVolume(larghezza*lunghezza*altezza);
    }
}
