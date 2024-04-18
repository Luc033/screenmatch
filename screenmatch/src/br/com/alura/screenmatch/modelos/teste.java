package br.com.alura.screenmatch.modelos;

//import br.com.alura.screenmatch.modelos.Tributavel;

public class teste implements Tributavel{

    private double totalImposto = 0;

    public void calculaImposto(Tributavel tributavel) {
        totalImposto += (int) tributavel.calculaImposto();
    }

    @Override
    public double calculaImposto() {
        return 0;
    }
}