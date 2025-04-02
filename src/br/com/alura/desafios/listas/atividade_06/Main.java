package br.com.alura.desafios.listas.atividade_06;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123, 10);
        ContaBancaria conta2 = new ContaBancaria(345, 100);
        ContaBancaria conta3 = new ContaBancaria(678, 10000);

        ArrayList<ContaBancaria> contas = new ArrayList<>();

        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        ContaBancaria maiorSaldoNaConta = contas.get(0);

        for (ContaBancaria c : contas) {
            if (c.getSaldo() > maiorSaldoNaConta.getSaldo()) {
                maiorSaldoNaConta = c;
            }
        }

        System.out.println("A conta " + maiorSaldoNaConta.getNumeroDaConta() + " possuí o maior Saldo no total de: " + maiorSaldoNaConta.getSaldo() + " R$");

    }
}
