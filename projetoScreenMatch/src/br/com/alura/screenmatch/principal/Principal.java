package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.model.Epsodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme("Pense como eles",2014);

        filme1.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: "+ filme1.getDuracaoEmMinutos());

        filme1.exibeFichaTecnica();
        filme1.avaliar(8);
        filme1.avaliar(5);
        filme1.avaliar(10);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.calcularMedia());


        Serie serie1 = new Serie("You",2020);

        serie1.exibeFichaTecnica();
        serie1.setTemporadas(5);
        serie1.setEpsodiosPorTemporada(10);
        serie1.setMinutosPorEpsodio(50);
        System.out.println("Duração da série: " + serie1.getDuracaoEmMinutos());


        Filme filme2 = new Filme("Avatar",2023);

        filme2.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtrar(filme1);


        Epsodio epsodio = new Epsodio();

        epsodio.setNumero(1);
        epsodio.setSerie(serie1);
        epsodio.setTotalVisualizacoes(300);
        filtro.filtrar(epsodio);


        var filme3 = new Filme("Quatro amigas e um jeans viajante",2005);

        filme3.setDuracaoEmMinutos(200);
        filme3.avaliar(10);

        List<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(serie1);

        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());
        System.out.println("toString da serie " + listaDeFilmes.get(3).toString());

    }
}
