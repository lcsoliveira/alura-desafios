package br.com.alura.desafios.listas.atividade_06;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;

    public ContaBancaria(int numeroDaConta, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

}
