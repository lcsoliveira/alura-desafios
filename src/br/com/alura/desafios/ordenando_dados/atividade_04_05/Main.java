package br.com.alura.desafios.ordenando_dados.atividade_04_05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList " + listaArrayList);
        System.out.println("LinkedList " + listaLinkedList);
    }
}
