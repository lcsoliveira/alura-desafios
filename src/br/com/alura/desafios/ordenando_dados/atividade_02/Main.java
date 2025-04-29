package br.com.alura.desafios.ordenando_dados.atividade_02;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();

        listaDeTitulos.add(new Titulo("A"));
        listaDeTitulos.add(new Titulo("D"));
        listaDeTitulos.add(new Titulo("C"));
        listaDeTitulos.add(new Titulo("B"));

        Collections.sort(listaDeTitulos);

        for (Titulo titulo: listaDeTitulos) {
            System.out.println(titulo.getNome());
        }

    }
}
