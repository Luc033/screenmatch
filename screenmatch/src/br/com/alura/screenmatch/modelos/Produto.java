package br.com.alura.screenmatch.modelos;

public class Produto {
    private String nome;
    private double preco;

    //GETTERS
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    //SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    //MÉTODO
    public double aplicarDesconto(double desconto){
        return preco = preco - (preco * desconto);
    }
}
