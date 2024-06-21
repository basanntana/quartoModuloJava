package br.com.alura.screenmatch.execao;



public class ErroDeConversaoDeAnoException extends RuntimeException {

    //atributo privado
    private String mensagem;

    //construtor
    public ErroDeConversaoDeAnoException(String mensagem){
       this.mensagem = mensagem;
    }


    //Sobrescrita do método getMessage
    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
