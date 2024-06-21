package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculos.Classificacao;

public class Serie extends Titulo {

    private int temporadas;
    private int epsodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpsodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpsodiosPorTemporada() {
        return epsodiosPorTemporada;
    }

    public void setEpsodiosPorTemporada(int epsodiosPorTemporada) {
        this.epsodiosPorTemporada = epsodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    //Anotação que possibilita a sobrescrita de métodos
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epsodiosPorTemporada * minutosPorEpsodio;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
