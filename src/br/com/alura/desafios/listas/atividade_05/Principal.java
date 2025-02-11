package br.com.alura.desafios.listas.atividade_05;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 10;

        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(circulo);
        formas.add(quadrado);

        for (Forma item : formas) {
            System.out.println("Área da Forma é igual a : " + item.calcularArea());
        }
    }

}
