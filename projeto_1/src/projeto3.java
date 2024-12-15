public class projeto3 {
    public static void main(String[] args) {
        // 1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.

        double x = 5.25;
        double y = 20.56;
        double result = x + y / 2;

        System.out.println("x + y / 2 = " + result);
        System.out.println("-".repeat(40));
        
        
        // 2. Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double a = 13.67;
        int b = 27;
        
        a = (int) a;  // Casting explícito de double para int
        
        System.out.println("O valor de a é: " + a + ". E o valor de b é: " + b);
        System.out.println("-".repeat(40));
        
        // 3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.    
        char c = 'A';
        String d = " Mamãe Noel trabalha muito durente o Natal.";
        
        System.out.println(c + d);
        System.out.println("-".repeat(40));

        // 4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem. 
        double precoProduto = 1.99;
        int quantidade = 30;

        System.out.println("O valor total do produto e: " + (precoProduto * quantidade));
        System.out.println("-".repeat(40));

        // 5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado. 
        double valorEmDolares = 3900.00;
        double valorDoDolar = 4.94;
        double valorEmReais = valorEmDolares * valorDoDolar;

        System.out.printf("O valor em R$ é: %.2f%n", valorEmReais); 

        /*
        System.out.printF(): Imprime mensagens com formatação personalziada
        %: Indica um marcador de formato;
        .2f: indica duas casas decimais;
        %n: indica uma quebra de linha 
         */

        System.out.println("-".repeat(40));

        // Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double precoOriginal = 100.00;
        double percentualDesconto = 10.0;
        double desconto = precoOriginal * (percentualDesconto / 100.0);
        double precoComDesconto = precoOriginal - desconto;

        System.out.printf("O preço com desconto é: %.2f%n", precoComDesconto);
    }
}
