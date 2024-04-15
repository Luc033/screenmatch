package br.com.alura.screenmatch.modelos;

public class ContaBancaria {
    private  int numeroConta;
    private  int agencia;
    private double saldo;
    public String titular;

    // GETTERS
    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public int getAgencia(){
        return  agencia;
    }
    /*
    public String getTitular() {
        return titular;
    }
    */
    //SETTERS

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    /*
    public void setTitular(String titular) {
        this.titular = titular;
    }
     */
}
