package br.com.alura.exercicioshttps.fileteste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutroTesteFile {

    public static void main(String[] args) throws IOException {


        File file = new File("C:\\saida.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("Olá, mundo!");
        writer.close();

    }
}
