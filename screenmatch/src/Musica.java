import java.awt.image.BandCombineOp;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFicha(){
        System.out.printf("Música: ",titulo);
        System.out.printf("Artista: ",artista);
        System.out.printf("Ano de lançamento: ",anoLancamento);
    }

    void avaliarMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaMusica(){
        return avaliacao/numAvaliacoes;
    }

}
