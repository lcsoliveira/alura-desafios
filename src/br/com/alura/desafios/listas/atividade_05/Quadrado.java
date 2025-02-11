package br.com.alura.desafios.listas.atividade_05;

public class Quadrado implements Forma {
    double lado;
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

}
