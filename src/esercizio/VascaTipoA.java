package esercizio;

public class VascaTipoA extends Vasca{
    public VascaTipoA(String nome, double diametroBase, double altezza) {
        super(nome);
        this.setVolume(2*(diametroBase/2)*Math.PI*altezza);
    }
}
