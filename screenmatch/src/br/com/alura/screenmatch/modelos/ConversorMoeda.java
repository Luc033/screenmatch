package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.ConversaoFinanceira;

/*

1 - Crie uma classe ConversorMoeda
2 - interface ConversaoFinanceira com o
3 - interface com método converterDolarParaReal()
    para converter um valor em dólar para reais.
4 - A classe deve receber o valor em dólar como parâmetro.


 */
public class ConversorMoeda implements ConversaoFinanceira {
    double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double converterDolarParaReal() {
        return valor * 5.27;
    }
}
