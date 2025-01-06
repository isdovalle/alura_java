package models;

//Parte2
public class Titulo implements Comparable<Titulo> {
    String nome;

    //Método compareTo da interface Comparable
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

}