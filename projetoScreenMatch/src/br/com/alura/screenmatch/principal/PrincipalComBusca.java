package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.execao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.model.Titulo;
import br.com.alura.screenmatch.model.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {


        Scanner leitura = new Scanner(System.in);
//        System.out.println("Digite um filme para busca: ");
        String busca = "";

        //Criação da lista
        List<Titulo> titulos = new ArrayList<>();

        //Transformando o Json em classe e alterando os dados recebidos com letras maiusculas
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting() //impressão do modelo Json
                .create();

        while(!busca.equalsIgnoreCase("Sair")) {
            System.out.println("Digite um filme para busca: ");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("Sair")){
                break;
            }

            //var busca = leitura.nextLine();
            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=66e81d08";//replace que ao receber espaço, junta para realizar a pesquisa.

            try {
                //conexao com API externa
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());


                String json = response.body();
                System.out.println(json);

                //Transformando o Json em classe Titulo
                //Gson gson = new Gson();



                //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
                //Usando o record
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                //Funcionalidade que lida com excessões
                //try {
                //referenciando o titulo recebido do Json para o objeto.
                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já convertido!");
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);//adicionando os titulos na lista

//                //Gravação de dados em arquivo
//                FileWriter escrita = new FileWriter("filmes.txt");
//                escrita.write(meuTitulo.toString());//pegando representação textual
//                escrita.close();//finalização da escrita.

            } catch (NumberFormatException e) { //Classe java que indica que a conversão do String não foi bem sucedida
                System.out.println("Erro detectado");
                System.out.println(e.getMessage());//mensagem de erro do NumberFormatException
            } catch (
                    IllegalArgumentException e) { //indica argumento inválido - No caso foi o espaçamento entre as letras
                System.out.println("Erro no argumento da busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) { //exception criada por mim
                System.out.println(e.getMessage());
//            } finally {
//                System.out.println("O programa finalizou completamente!");
//            }
            }
        }
        FileWriter escrita = new FileWriter("filmes.json");//criando arquivo no modelo Json
        escrita.write(gson.toJson(titulos));//criação dos titulos em formato de Json
        escrita.close();//finalização
        System.out.println(titulos);
        System.out.println("O programa finalizou corretamente");

    }

}
