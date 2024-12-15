
// Importa a entrada do usuário
import java.util.Scanner;

public class projeto2 {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um valor em Celsius
        System.out.print("Digite um valor para temperatura em Celsius (tc): ");

        // Lê o valor de temperatura em Celsius (tc) digitado pelo usuário
        float tc = scanner.nextFloat();

        // Realiza a conversão de Celsius para Fahrenheit (tf)
        float tf = tc * 1.8f + 32;

        // Exibe o resultado da conversão para o usuário
        System.out.println("Temperatura em Fahrenheit (tf): " + tf + "°F");

        // Fecha o objeto Scanner para liberar os recursos associados
        scanner.close();
    }
}
