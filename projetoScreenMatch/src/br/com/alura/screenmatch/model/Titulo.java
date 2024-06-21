package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.execao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    //aplicando construtores no código
    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    //Construtor que recebe os dados do Json
    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não foi possível converter a data porque tem mais de 4 caracteres.");//criação da exception
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year()); //conversão para int
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2)); //subbstring adicionado para mostrar apenas até a posição 2
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //método sem argumento
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    //método com argumento que soma a quantidade de avaliações
    public void avaliar(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double calcularMedia(){

        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    //Critério de ordenação compareTo
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return  "(nome = " + nome + " anoDeLancamento = " + anoDeLancamento + " duração = " + duracaoEmMinutos + ")";
    }
}
