package br.com.alura.exercicioshttps.trycatch;
import java.util.Scanner;
public class ExercicioDivisao {

      //Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
     //Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o numerador: ");
        int numerador = scanner.nextInt();

        System.out.println("Informe o denominador: ");
        int denominador = scanner.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida.");
        }





    }


}
