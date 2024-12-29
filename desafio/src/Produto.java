//classe Produto
public class Produto {
    String nome;
    double preco;
    int quantidade;

    // construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }


    // Método toString para imprimir os produtos
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    // Classe ProdutoPerecivel que herda de Produto
    public static class ProdutoPerecivel extends Produto {
        String dataValidade;

        // Contrutor da classe super
        public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
            super(nome, preco, quantidade); //Chamada construtor da classe mãe
            this.dataValidade = dataValidade;
        }


        // Método toString para imprimir os produtos perecíveis
        @Override
        public String toString() {
            return super.toString() + ", dataValidade='" + dataValidade + "'";
        }
    
    }

    public static void main(String[] args) {
        // criando lista de produtos
        Produto[] produtos = new Produto[5];

        // criando produtos
        produtos[0] = new Produto("Banana", 10.0, 5);
        produtos[1] = new Produto("Maçã", 5.0, 10);
        produtos[2] = new Produto("Pera", 7.0, 3);
        produtos[3] = new Produto("Uva", 15.0, 2);
        produtos[4] = new Produto("Melancia", 20.0, 1);

        // imprimindo tamanho da lista
        System.out.println("Tamanho da lista: " + produtos.length);

        // recuperando produto pelo indice da lista
        System.err.println("Uva: " + produtos[3].nome);

        // imprimindo a lista de produtos
        System.out.println("Lista de produtos");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        // criando e imprimindo produto perecível
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Banana", 10.0, 5, "10/10/2021");
        System.out.println(produtoPerecivel);
    }
}