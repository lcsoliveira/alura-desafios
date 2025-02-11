package br.com.alura.desafios.listas.atividade_04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Teclado", 200.50);
        Produto p2 = new Produto("Mouse", 135.99);
        Produto p3 = new Produto("Monitor", 999.99);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        double precoTotal = 0;
        int i = 0;

        for (Produto item : produtos) {
            precoTotal += item.getPreco();
        }

        double precoMedio = precoTotal / produtos.size();
        System.out.println("Média de preços: " + precoMedio);

    }
}
