package br.com.alura.screenmatch.modelos;

public  class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //GETTERS
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    // MÉTODOS
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome: "+nome);
        System.out.println("Ano de lançamento: "+anoDeLancamento);
        System.out.println("Duração: "+duracaoEmMinutos+" min.");
        System.out.println("Incluído no plano: "+incluidoNoPlano);

    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }

    //public abstract int getDuracaoEmMinutos();
}
