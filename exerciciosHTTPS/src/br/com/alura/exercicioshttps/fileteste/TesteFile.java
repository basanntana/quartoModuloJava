package br.com.alura.exercicioshttps.fileteste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TesteFile {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\DELL Inspiron\\Desktop\\anotacoes_Java\\anotacoes_JVM.txt");
        FileReader reader = new FileReader(file);

        int data = reader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
        reader.close();

    }
}
