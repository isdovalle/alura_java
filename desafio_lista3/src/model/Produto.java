package model;

public class Produto {
    private String nome;  // Variável nome para armazenar o nome do produto
    private double preco; // Variável preco para armazenar o preço do produto

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método para acessar o preço
    public double getPreco() {
        return preco;
    }

    // Método para acessar o nome
    public String getNome() {
        return nome;
    }
}
