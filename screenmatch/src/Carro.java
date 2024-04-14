public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFicha(){
        System.out.printf("Carro: %s\nAno: %d\nCor: %s\n", modelo, ano, cor);
    }

    int idadeCarro(){
        return 2024 - ano;
    }
}
