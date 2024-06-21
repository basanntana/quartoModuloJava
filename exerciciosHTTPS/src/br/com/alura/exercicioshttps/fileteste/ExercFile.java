package br.com.alura.exercicioshttps.fileteste;

import java.io.FileWriter;
import java.io.IOException;

public class ExercFile {

    public static void main(String[] args) throws IOException {


//        Crie um programa em Java que escreva a seguinte mensagem em um arquivo chamado "arquivo.txt":
//        "Conteúdo a ser gravado no arquivo." Utilize as classes do pacote java.io.

        String mensagem = "Conteúdo a ser gravado no arquivo.";

        try (FileWriter writer = new FileWriter("arquivo.txt")) {
            writer.write(mensagem);
            System.out.println("Dados gravados com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
