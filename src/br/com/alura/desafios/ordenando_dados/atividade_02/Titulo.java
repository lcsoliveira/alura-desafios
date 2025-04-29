package br.com.alura.desafios.ordenando_dados.atividade_02;

public class Titulo implements Comparable<Titulo>{

    public Titulo(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
