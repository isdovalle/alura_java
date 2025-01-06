import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList; // Importando LinkedList

// Classe Titulo para exemplo
class Titulo implements Comparable<Titulo> {
    String nome;

    // Construtor da classe Titulo
    public Titulo(String nome) {
        this.nome = nome;
    }

    // Implementação do método compareTo para permitir a comparação dos objetos Titulo
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome); // Comparando pelo nome
    }
}

public class Main {
    public static void main(String[] args) {
        // Parte 1: Criando uma lista de inteiros
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(30);  // Adicionando um número à lista
        list.add(98);  // Adicionando um número à lista
        list.add(75);  // Adicionando um número à lista

        // Parte 1: Ordenando a lista de forma crescente
        Collections.sort(list);  // Ordenando a lista em ordem crescente

        // Parte 1: Imprimindo a lista ordenada
        System.out.println("Lista ordenada: " + list);
       
        // Separador de output
        System.out.println("-----");

        // Parte 3: Criando uma lista de objetos Titulo
        ArrayList<Titulo> listaTitulos = new ArrayList<Titulo>();
        listaTitulos.add(new Titulo("Mufasa"));  // Adicionando um título à lista
        listaTitulos.add(new Titulo("Wicked"));  // Adicionando um título à lista
        listaTitulos.add(new Titulo("O Auto da Compadecida 2"));  // Adicionando um título à lista

        // Parte 3: Ordenando a lista de títulos
        Collections.sort(listaTitulos);  // Ordenando a lista de objetos Titulo

        // Parte 3: Imprimindo a lista de títulos ordenada
        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.nome);  // Imprimindo o nome de cada título na lista
        }
            
        // Separador de output
        System.out.println("-----");

        // Parte 4: Criando uma ArrayList utilizando a interface List
        List<String> listaArraylist = new ArrayList<>();
        listaArraylist.add("Sódio");    // Adicionando um elemento à lista
        listaArraylist.add("Potássio"); // Adicionando um elemento à lista
        listaArraylist.add("Bário");    // Adicionando um elemento à lista

        // Parte 4: Instanciando a mesma lista como LinkedList
        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Sódio");    // Adicionando um elemento à lista
        listaLinkedList.add("Potássio"); // Adicionando um elemento à lista
        listaLinkedList.add("Bário");    // Adicionando um elemento à lista

        // Parte 4: Imprimindo as duas listas para demonstrar que é possível trocar facilmente a implementação
        System.out.println("ArrayList:" + listaArraylist);  // Imprimindo a lista como ArrayList
        System.out.println("List:" + listaLinkedList);      // Imprimindo a lista como LinkedList

        // Separador de output
        System.out.println("-----");

        // Parte 5: Modificando a parte 4 para declarar a variável de lista como a interface List
        List<String> listaPolimorfica;

        // Parte 5: Imprimindo a lista com ArrayList e LinkedList usando polimorfismo
        listaPolimorfica = new ArrayList<>();  // Usando ArrayList
        listaPolimorfica.add("Sódio");         // Adicionando um elemento
        listaPolimorfica.add("Potássio");      // Adicionando um elemento
        listaPolimorfica.add("Bário");         // Adicionando um elemento
        System.out.println("ArrayList:" + listaPolimorfica);  // Imprimindo a lista com ArrayList

        listaPolimorfica = new LinkedList<>(); // Usando LinkedList
        listaPolimorfica.add("Sódio");         // Adicionando um elemento
        listaPolimorfica.add("Potássio");      // Adicionando um elemento
        listaPolimorfica.add("Bário");         // Adicionando um elemento
        System.out.println("LinkedList:" + listaPolimorfica);  // Imprimindo a lista com LinkedList
    }
}