package br.com.alura.exercicioshttps.trycatch;

public class SenhaInvalidaException extends RuntimeException {

    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
