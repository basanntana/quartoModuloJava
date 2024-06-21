package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

import java.util.*;

public class PrincipalComListas {

    public static void main(String[] args) {

        var filme1 = new Filme("Pense como eles",2014);
        filme1.avaliar(9);
        var filme2 = new Filme("Avatar",2023);
        filme2.avaliar(6);
        var filme3 = new Filme("Quatro amigas e um jeans viajante",2005);
        filme3.avaliar(10);
        var serie1 = new Serie("You",2020);



        //Interface List classe mãe Titulo
        List<Titulo> lista = new LinkedList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

         //Implementação dos itens da lista através do foreach
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            //se o item é uma instância de Filme
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: "+ filme.getClassificacao());
            }
//            //referenciando um item do tipo filme, e também usando casting
//            Filme filme = (Filme) item;
//            System.out.println("Classificação: "+ filme.getClassificacao());
        }

        //Interface List
        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Beyoncé");
        buscaPorArtista.add("Idris Elba");
        buscaPorArtista.add("Michael B Jordan");
        buscaPorArtista.add("Taraj P Henson");

        System.out.println(buscaPorArtista);

        System.out.println("Depois da ordenação:");

        //ordenação alfabética
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        //ordenação da lista de Títulos
        Collections.sort(lista);
        System.out.println("Lista de titulos odernados: " + lista);

        //ordenação por ano de lançamento
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenação por ano de lançamento");
        System.out.println(lista);



    }
}
