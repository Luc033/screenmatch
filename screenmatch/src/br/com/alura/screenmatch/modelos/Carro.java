package br.com.alura.screenmatch.modelos;

public class Carro {
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;
    //private int ano;
    //private String cor;

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double exibirPreco(String t) {
        double verificador = 0;
        switch (t) {
            case "maior":
                if (this.precoAno1 > this.precoAno2 && this.precoAno1 > this.precoAno3) {
                    verificador = precoAno1;
                } else if (this.precoAno2 > this.precoAno1 && this.precoAno2 > this.precoAno3) {
                    verificador = precoAno2;
                } else if (this.precoAno3 > this.precoAno1 && this.precoAno3 > this.precoAno2) {
                    verificador = precoAno3;
                } else {
                    System.out.println("Error!");
                }
                break;
            case "menor":
                if (this.precoAno1 < this.precoAno2 && this.precoAno1 < this.precoAno3) {
                    verificador = precoAno1;
                } else if (this.precoAno2 < this.precoAno1 && this.precoAno2 < this.precoAno3) {
                    verificador = precoAno2;
                } else if (this.precoAno3 < this.precoAno1 && this.precoAno3 < this.precoAno2) {
                    verificador = precoAno3;
                } else {
                    System.out.println("Error!");
                }
                break;
            default:
                System.out.println("Valores errados!");
        }
        if (t.equals("maior")) {
            System.out.print("O maior preço é ");
        } else if (t.equals("menor")) {
            System.out.print("O menor preço é ");
        }
        return verificador;
    }

    public void exibirInfo(){
        System.out.printf("""
                Modelo: %s
                Preço ano 1: %.2f
                Preço ano 2: %.2f
                Preço ano 3: %.2f
                Maior preço: %.2f
                Menor preço: %.2f
                """, nomeModelo, precoAno1, precoAno2, precoAno2, exibirPreco("maior"), exibirPreco("menor"));
    }
}