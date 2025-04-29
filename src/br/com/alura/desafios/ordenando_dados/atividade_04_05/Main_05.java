package br.com.alura.desafios.ordenando_dados.atividade_04_05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main_05 {
    public static void main(String[] args) {
        List<String> listaPoliformica;

        listaPoliformica = new ArrayList<>();
        listaPoliformica.add("Elemento 1");
        listaPoliformica.add("Elemento 2");
        System.out.println("ArrayList " + listaPoliformica);

        listaPoliformica = new LinkedList<>();
        listaPoliformica.add("Elemento A");
        listaPoliformica.add("Elemento B");
        System.out.println("LinkedList " + listaPoliformica);
    }
}
