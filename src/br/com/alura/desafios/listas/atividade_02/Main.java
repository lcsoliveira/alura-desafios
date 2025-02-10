package br.com.alura.desafios.listas.atividade_02;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("É um cachorro");
        }


    }
}
