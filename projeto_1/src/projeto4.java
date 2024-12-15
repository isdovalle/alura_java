import java.util.Random;
import java.util.Scanner;

public class projeto4 {
    public static void main(String[] args) {
        Random numero = new Random();
        // Gera um número aleatório entre 1 e 100
        int numeroAleatorio = numero.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        // Inicializa número de escolha do usuário e tentativas
        int tentativas = 0;
        int escolhaDoUsuario = 0;

        // Resposta do sistema até 5 tentativas
        while (tentativas < 5) {
            System.out.println("Digite um número entre 1 e 100: ");
            escolhaDoUsuario = scanner.nextInt();
            tentativas += 1;

            // Verifica se o número escolhido pelo usuário é igual ao número aleatório
            if (escolhaDoUsuario == numeroAleatorio) {
                System.out.println("Parabéns, você acertou!");
                break;

                // O numero escolhido é maior ou menor que o número aleatório
            } else if (escolhaDoUsuario < numeroAleatorio) {
                System.out.println("Tente novamente.");
                System.out.println("O número escolhido foi maior.");

                // O numero escolhido foi menor
            } else {
                System.out.println("Tente novamente.");
                System.out.println("O número escolhido foi menor.");
            }

            // Mostra tentativas restantes
            System.out.println("Tentativas restantes: " + (5 - tentativas));
        }

        // Mostra mensagem ao usuário que se esgotaram as tentativas
        if (tentativas == 5 && escolhaDoUsuario != numeroAleatorio) {
            System.out.println("Suas tentativas acabaram. O número era: " + numeroAleatorio);
        }
        // Encerra o Scanner
        scanner.close();
    }
}