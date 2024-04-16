package br.com.alura.screenmatch.modelos;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au! Au!");
    }

    public void abanarRabo(){
        System.out.println("Abanou o rabo!");
    }
}
