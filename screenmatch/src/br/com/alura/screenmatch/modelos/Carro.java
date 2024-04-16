package br.com.alura.screenmatch.modelos;

public class Carro {
    private String nomeModelo;
    private int ano;
    private String cor;

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    void exibirFicha(){
        System.out.printf("br.com.alura.screenmatch.modelos.Carro: %s\nAno: %d\nCor: %s\n", nomeModelo, ano, cor);
    }

    int idadeCarro(){
        return 2024 - ano;
    }
}
