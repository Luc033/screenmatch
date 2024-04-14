public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Vingadores";
        meuFilme.anoDeLancamento = 2012;
        meuFilme.duracaoEmMinutos = 180;

         meuFilme.exibeFichaTecnica();
         meuFilme.avalia(8);
         meuFilme.avalia(5);
         meuFilme.avalia(9);
         meuFilme.avalia(4);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        // NOVO OBJETO
        System.out.println("========================================");
        Filme filme1 = new Filme();
        filme1.nome = "Harry Potter e a Pedra Filosofal";
        filme1.anoDeLancamento = 2002;
        filme1.duracaoEmMinutos = 120;

        filme1.avalia(7);
        filme1.avalia(7);
        filme1.avalia(5);
        filme1.avalia(9);
        filme1.avalia(6.5);
        filme1.avalia(9.5);
        filme1.avalia(10);
        filme1.avalia(10);
        filme1.avalia(3);
        filme1.avalia(4.5);
        filme1.avalia(0);
        filme1.avalia(5.5);
        filme1.avalia(8);
        filme1.avalia(7.9);
        filme1.avalia(7);
        filme1.exibeFichaTecnica();
        System.out.printf("A soma das avaliações: ", filme1.somaDasAvaliacoes);
        System.out.println(filme1.somaDasAvaliacoes);
        System.out.printf("Total de pessoas que avaliaram: ", filme1.totalDeAvaliacoes);
        System.out.println(filme1.totalDeAvaliacoes);
        System.out.printf("Sendo a média de avaliações: ", filme1.pegaMedia());
        System.out.println(filme1.pegaMedia());
        System.out.println("=================================================");

        // EX 1 CLASSE PESSOA
        Pessoa pessoa1 = new Pessoa();
        pessoa1.helloWorld();
        System.out.println("=================================================");

        // EX 2 - CLASSE CALCULADORA
        Calculadora num1 = new Calculadora();
        System.out.println("O dobro é: "+num1.retornaDobro(2));
        System.out.println("=================================================");

        // EX 3 - CLASSE MUSICA
        Musica musica1 = new Musica();
        musica1.titulo = "The Trooper";
        musica1.artista = "Iron Maiden";
        musica1.anoLancamento = 1985;

        musica1.avaliarMusica(8);
        musica1.avaliarMusica(6);
        musica1.avaliarMusica(9);
        musica1.avaliarMusica(9);
        musica1.avaliarMusica(10);
        musica1.avaliarMusica(8);

        System.out.printf("Música: %s\nArtista: %s\nAno: %d\n", musica1.titulo, musica1.artista, musica1.anoLancamento);
        System.out.printf("Total de avaliações: %.0f\nMédia de avaliações: %.1f\n", musica1.avaliacao, musica1.mediaMusica());

        //EX 4 - CLASSE CARRO
        System.out.println("=================================================");
        Carro carro1 = new Carro();
        carro1.modelo = "gol";
        carro1.ano = 2005;
        carro1.cor = "vermelho";

        carro1.exibirFicha();
        System.out.printf("Idade do carro: %d anos\n", carro1.idadeCarro());

        // EX 5 - CLASSE ALUNO
        System.out.println("=================================================");
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Jorgin Fogueteiro";
        aluno1.idade = 14;

        aluno1.exibirInfo();
    }
}