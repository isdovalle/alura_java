package model;

public class ContaBancaria {
    private int numeroConta; // Criando conta bancária
    private double saldo;    // Criando saldo da conta bancária

    // Construtor
    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // Método para acessar o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    // Método para acessar o saldo
    public double getSaldo() {
        return saldo;
    }
}
