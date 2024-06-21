package br.com.alura.exercicioshttps.fileteste;

public class Veiculo {

    private String modelo;
    private String cor;
    private int ano;

    public Veiculo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo +
                ", cor='" + cor +
                ", ano=" + ano + '}';
    }
}
