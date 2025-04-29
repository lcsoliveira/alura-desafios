package br.com.alura.desafios.ordenando_dados.atividade_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(1);
        lista.add(5);
        System.out.println("Before sort: " + lista);

        Collections.sort(lista);
        System.out.println("After sort: " + lista);

    }
}
