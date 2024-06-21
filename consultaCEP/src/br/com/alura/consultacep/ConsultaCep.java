package br.com.alura.consultacep;

import com.google.gson.Gson;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco buscaEndereco(String cep){

        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json");

        //requisicao
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();


        try { //Tratamento de exceptions
            HttpResponse<String> response = HttpClient //resposta
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);//conversao para Json
        } catch (Exception e) { //falha
            throw new RuntimeException("Não consegui obter o endereço através desse CEP"); //exceção pode ser prevenida
        }



    }


}
