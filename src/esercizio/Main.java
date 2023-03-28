package esercizio;

public class Main {
    public static void main(String[] args) {
        Vasca v1 = new Vasca("Vasca 1");
        VascaTipoA va1 = new VascaTipoA("Vasca A1",12,275);
        VascaTipoB vb1 = new VascaTipoB("Vasca B1",69,69,90);
        Acquedotto a = new Acquedotto();
        a.aggiungiVasca(v1);
        a.aggiungiVasca(va1);
        a.aggiungiVasca(vb1);
        a.aggiungiContenuto("Vasca A1", 11.69);
        System.out.println("a.aggiungiContenuto(\"Vasca A1\", 11.69) --> new value: " + va1.getContenuto());
        a.aggiungiContenuto("Vasca B1", 126);
        System.out.println("a.aggiungiContenuto(\"Vasca A1\", 11.69) --> new value: " + va1.getContenuto());
        a.aggiungiContenuto("Vasca B1", 126);
    }
}
