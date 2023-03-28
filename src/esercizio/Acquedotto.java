package esercizio;

import java.util.ArrayList;

public class Acquedotto {
    private ArrayList<Vasca> lista;

    public Acquedotto() {
        this.lista = new ArrayList<>();
    }

    public void aggiungiContenuto(String nome, double aggiunta){
        for(Vasca v : this.lista){
            if(v.getNome().equalsIgnoreCase(nome)){
                v.aggiungiContenuto(aggiunta);
            }
        }
    }

    public void prelevaContenuto(String nome, double preleva){
        for(Vasca v : this.lista){
            if(v.getNome().equalsIgnoreCase(nome)){
                v.prelevaContenuto(preleva);
            }
        }
    }

    public double getContenuto(){
        double tot = 0;
        for(Vasca v : this.lista){
            tot += v.getContenuto();
        }
        return tot;
    }

    public double getDispo(){
        double tot = 0;
        for(Vasca v : this.lista){
            tot += v.getVolume();
        }
        return tot - this.getContenuto();
    }

    public void aggiungiVasca(Vasca vasca){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i).getNome().equalsIgnoreCase(vasca.getNome()))
                return;
            if(i == lista.size())
                lista.add(vasca);
        }
    }

    public void rimuoviVasca(String nome){
        for(Vasca v : this.lista)
            if(v.getNome().equalsIgnoreCase(nome))
                this.lista.remove(v);
    }

    public int contaVasceA(){
        int cont = 0;
        for(Vasca v : this.lista){
            if(v instanceof VascaTipoA)
                cont++;
        }
        return cont;
    }
}