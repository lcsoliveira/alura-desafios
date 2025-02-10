package br.com.alura.desafios.listas.atividade_01;

import java.util.ArrayList;

public class Atividade_01 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Ana Julia");
        lista.add("Jessica");
        lista.add("Lucas");
        lista.forEach(item -> System.out.println(item));
    }
}
