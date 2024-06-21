package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Epsodio implements Classificacao {

    private int numero;
    private String nome;
    private Serie serie;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    private int totalVisualizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() { //implementação da interface
        if(totalVisualizacoes > 100){
            return 4;
        } else {
            return 2;
        }

    }
}
