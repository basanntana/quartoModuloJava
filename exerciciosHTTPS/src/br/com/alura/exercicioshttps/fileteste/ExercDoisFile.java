package br.com.alura.exercicioshttps.fileteste;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExercDoisFile {

    public static void main(String[] args) {

        Titulo titulo = new Titulo();

        // Configuração do Gson com Pretty Printing
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);

        System.out.println(json);


//        Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante.
//                Utilize o método setPrettyPrinting para alcançar esse resultado.



    }

}

