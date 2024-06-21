package br.com.alura.consultacep;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o número do CEP (apenas numeros): ");
        var cep = leitura.nextLine();

        try {
          Endereco novoEndereco = consultaCep.buscaEndereco(cep);
          System.out.println(novoEndereco);
          GeradorDeArquivo gerador = new GeradorDeArquivo();
          gerador.geradorJson(novoEndereco);
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());//exibicao da mensagem de erro
            System.out.println("Finalizando aplicação");
        }


    }
}
