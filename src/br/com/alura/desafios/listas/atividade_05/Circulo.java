package br.com.alura.desafios.listas.atividade_05;

public class Circulo implements Forma {
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
