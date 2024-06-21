package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {

    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (calcularMedia()/2); //uso do Casting para conversão do double para int
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
