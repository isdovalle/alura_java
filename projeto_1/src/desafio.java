import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {

        String titular = "Sasha Fierce";
        String tipoConta = "Poupança";
        double saldo = 30000.00;

        Scanner scanner = new Scanner(System.in);
        int opcao = 0; // Inicialização da opção	

        while (opcao != 4) { 
            System.out.println("Bem-vindo, " + titular);
            System.out.println("Tipo de conta: " + tipoConta);
            System.out.printf("Saldo: %.2f%n", saldo);
            System.out.println("-".repeat(40));

            // Opções do menu
            System.out.println("Escolha a opção desejada:");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            opcao = scanner.nextInt(); // Escolha da opção

            switch (opcao) {
                case 1:
                    System.out.println();
                    System.out.printf("Seu saldo é: %.2f%n", saldo);
                    System.out.println("-".repeat(40));
                    break;
                case 2:
                    System.out.println("Você escolheu receber um valor");
                    System.out.println("Informe o valor a ser recebido:");
                    double valorRecebido = scanner.nextDouble();
                    saldo += valorRecebido;
                    System.out.printf("Seu saldo atual é: %.2f%n", saldo);
                    break;
                case 3:
                    System.out.println("Você escolheu transferir um valor");
                    System.out.println("Informe o valor a ser transferido:");
                    double transferido = scanner.nextDouble();
                    if (transferido > saldo) {
                        System.out.println("Saldo insuficiente para a transferência.");
                    } else {
                        saldo -= transferido;
                        System.out.printf("Seu saldo atual é: %.2f%n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("Encerrando a sessão.");
                    break; // Encerra o programa
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }

            System.out.println(); // Apenas para espaçamento entre interações do menu
        }

        scanner.close(); // Fecha o Scanner
    }
}
