
//Usado para operações matemáticas grandes 
import java.math.BigInteger;
// Usado para ler entradas do usuário
import java.util.Scanner;

public class projeto5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * 1. Solicitar ao usuário digitar um número e verificar se é positivo, negativo
         * ou zero.
         */
        System.out.println("Digite um número pertencente ao conjunto dos inteiros: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("O número é positivo");
        } else if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é zero");
        }

        System.out.println("-".repeat(40)); // Separador para organizar saídas no console

        /*
         * 2. Comparar dois números inteiros inseridos pelo usuário.
         */
        System.out.println("Digite um número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int num2 = scanner.nextInt();
        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é maior");
        } else {
            System.out.println("O segundo número é maior");
        }

        System.out.println("-".repeat(40)); // Separador para organizar saídas no console

        /*
         * 3. Menu para calcular área do quadrado ou círculo.
         */
        System.out.println("Escolha uma opção: ");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            System.out.println("Digite o lado do quadrado: ");
            double lado = scanner.nextDouble();
            double area = Math.pow(lado, 2);
            System.out.println("Área do quadrado: " + area);
        } else if (opcao == 2) {
            System.out.println("Digite o raio do círculo: ");
            double raio = scanner.nextDouble();
            double area = Math.PI * Math.pow(raio, 2);
            System.out.printf("Área do círculo: %.2f%n", area);
        } else {
            System.out.println("Opção inválida!");
        }

        System.out.println("-".repeat(40)); // Separador para organizar saídas no console

        /*
         * 4. Exibir a tabuada de um número inserido pelo usuário.
         */
        System.out.println("Digite um número para exibir a tabuada: ");
        int numeroTabuada = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroTabuada + " x " + i + " = " + (numeroTabuada * i));
        }

        System.out.println("-".repeat(40)); // Separador para organizar saídas no console

        /*
         * \
         * 5. Crie um programa que solicite ao usuário a entrada de um número inteiro.
         * Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
         */
        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = scanner.nextInt();
        if (numeroInteiro % 2 == 0) {
            System.out.println("O número " + numeroInteiro + " é par.");
        } else {
            System.out.println("O número " + numeroInteiro + " é ímpar.");
        }

        System.out.println("-".repeat(40)); // Separador para organizar saídas no console

        /*
         * 6. Crie um programa que solicite ao usuário um número e calcule o fatorial
         * desse número.
         */
        // Solicita o número para o cálculo do fatorial
        System.out.println("Digite um número para calcular seu fatorial: ");

        // Inicializa o número como BigInteger
        BigInteger numeroFatorial = BigInteger.valueOf(scanner.nextInt()); // Converte o número inserido para BigInteger

        // Inicializa o fatorial como 1
        BigInteger fatorial = BigInteger.ONE;

        // Calcula o fatorial usando um loop
        for (int i = 1; i <= numeroFatorial.intValue(); i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i)); // Multiplica o fatorial por cada número, já que quando
                                                                 // usamos BigInteger não podemos usar operadores
                                                                 // aritméticos normais
        }

        // Exibe o resultado
        System.out.println("O fatorial de " + numeroFatorial + " é: " + fatorial);

        scanner.close(); // Fecha o objeto Scanner
    }
}
