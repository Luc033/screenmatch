package br.com.alura.screenmatch.modelos;

public class IdadePessoa {
    private String nome;
    private int idade;

    //GETTERS
    public int getIdade(){
        return idade;
    }
    public String getNome(){
        return nome;
    }

    //SETTERS
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setNomme(String nome){
        this.nome = nome;
    }

    //MÉTODO
    public void verificaIdade(){
        if(idade >= 18){
            System.out.println("Maior de idade.");
        }else{
            System.out.println("Menor de idade.");
        }
    }
}
