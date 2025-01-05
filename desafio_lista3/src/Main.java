import model.Animal;
import model.Cachorro;
import model.ContaBancaria;
import model.Forma;
import model.Produto;
import shapes.Losango;
import shapes.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Primeira parte: Desafio com ArrayList e loop foreach
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Cachorro");
        lista.add("Gato");
        lista.add("Papagaio");
        lista.add("Arara");
        lista.add("Pato");

        for (String animais : lista) {
            System.out.println(animais);
        }

        // Segunda parte: Criando objeto da classe Cachorro e fazendo casting
        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;
        animal.pertence();

        // Terceira parte: Usando o instanceof
        if (cachorro instanceof Animal) {
            animal = (Animal) cachorro;
            animal.pertence();
        } else {
            System.out.println("Objeto não é do tipo correto.");
        }

        // Quarta Parte: Cálculo de média de preços
        Produto p1 = new Produto("Arroz", 10.0);
        Produto p2 = new Produto("Feijão", 8.0);
        Produto p3 = new Produto("Macarrão", 5.0);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }

        double media = total / produtos.size();
        System.out.println("Média de preços: " + media);

        // Quinta parte: Cálculo da área de formas
        List<Forma> formas = new ArrayList<>();
        formas.add(new Losango(10, 5)); // Diagonais 10 e 5
        formas.add(new Triangulo(15, 6)); // Base 15, altura 6

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }

        // Sexta parte: Criando instâncias de ContaBancaria
        ContaBancaria C1 = new ContaBancaria(12345, 1000.0);
        ContaBancaria C2 = new ContaBancaria(54321, 2000.0);
        ContaBancaria C3 = new ContaBancaria(67890, 3000.0);

        // Criando uma lista de contas bancárias
        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(C1);
        contas.add(C2);
        contas.add(C3);

        // Encontrando a conta com o maior saldo
        ContaBancaria maiorSaldo = contas.get(0); // Inicializa com a primeira conta
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > maiorSaldo.getSaldo()) {
                maiorSaldo = conta; // Atualiza para a conta com o maior saldo
            }
        }

        // Imprimindo a conta com o maior saldo
        System.out.println("Conta com maior saldo:");
        System.out.println("Número da conta: " + maiorSaldo.getNumeroConta());
        System.out.println("Saldo: " + maiorSaldo.getSaldo());
    }
}
