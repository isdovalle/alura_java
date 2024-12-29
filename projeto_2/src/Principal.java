import java.util.ArrayList;

class Pessoa {
    //Utilizado o private para ninguém poder acessar diretamente fora da classe
    private String nome; 
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override //classe filha sobrescreve a classe pai
    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + "}";
    }
}

public class Principal {
    public static void main(String[] args) {
        // Criação do ArrayList de Pessoa
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        // Adicionando pessoas à lista
        listaDePessoas.add(new Pessoa("Sasha Fierce", 40));
        listaDePessoas.add(new Pessoa("Rodrigo", 40));
        listaDePessoas.add(new Pessoa("Guido  ", 35));

        // Imprimindo o tamanho da lista
        System.out.println("Tamanho da lista: " + listaDePessoas.size());

        // Imprimindo a primeira pessoa da lista
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));

        // Imprimindo a lista completa
        System.out.println("Lista completa:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
