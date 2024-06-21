package br.com.alura.exercicioshttps.fileteste;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExercTresFile {

    public static void main(String[] args) {

//        Defina uma classe chamada Veiculo com os atributos necessários.
//        Em seguida, crie um programa que instancia um objeto Veiculo, serializa esse objeto
//        para JSON usando a biblioteca Gson e imprime o resultado.

        var primeiroModelo = new Veiculo("Celta", "Preto");
        var segundoModelo = new Veiculo("Gol", "Branco");


        // Configuração do Gson com Pretty Printing
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(primeiroModelo);
        String jsonn = gson.toJson(segundoModelo);

        System.out.println(json);
        System.out.println(jsonn);
    }
}
