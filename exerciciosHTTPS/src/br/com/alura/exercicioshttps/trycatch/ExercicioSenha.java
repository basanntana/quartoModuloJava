package br.com.alura.exercicioshttps.trycatch;

import java.util.Scanner;

public class ExercicioSenha {

    public static void main(String[] args) {

     //Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException,
        // uma classe de exceção personalizada que deve ser lançada caso a senha não atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres).

        Scanner leituraSenha = new Scanner(System.in);

        System.out.println("Digite sua senha:   ");
        String senha = leituraSenha.nextLine();

        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }

}

