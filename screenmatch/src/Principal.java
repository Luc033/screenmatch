import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.*;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Vingadores");
        meuFilme.setAnoDeLancamento(2012);
        meuFilme.setDuracaoEmMinutos(180);

         meuFilme.exibeFichaTecnica();
         meuFilme.avalia(8);
         meuFilme.avalia(5);
         meuFilme.avalia(9);
         meuFilme.avalia(4);

        //System.out.println(meuFilme.somaDasAvaliacoes);
        //System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        Filme filme2 = new Filme();
        filme2.setNome("Harry Potter e a Câmara Secreta");
        filme2.setAnoDeLancamento(2004);
        filme2.setDuracaoEmMinutos(150);

        // NOVO OBJETO
        System.out.println("========================================");
        Filme filme1 = new Filme();
        filme1.setNome("Harry Potter e a Pedra Filosofal");
        filme1.setAnoDeLancamento(2002);
        filme1.setDuracaoEmMinutos(120);

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

        //System.out.printf("Total de pessoas que avaliaram: ", filme1.totalDeAvaliacoes);
        //System.out.println(filme1.totalDeAvaliacoes);
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
        /*
        System.out.println("=================================================");
        Carro carro1 = new Carro();
        carro1.setNomeModelo("gol");
        carro1.setAno(2005);
        carro1.setCor("vermelho");
         */

        //carro1.exibirFicha();
        //System.out.printf("Idade do carro: %d anos\n", carro1.idadeCarro());

        // EX 5 - CLASSE ALUNO
        System.out.println("=================================================");
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Jorgin Fogueteiro";
        aluno1.idade = 14;

        aluno1.exibirInfo();

        // AULA 2
        // EX 1 - CLASSE CONTABANCARIA
        System.out.println("=================================================");
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Lucas Melo";
        conta1.setNumeroConta(1234);
        conta1.setAgencia(3);
        conta1.setSaldo(1000);
        System.out.printf("Nome do titular: %s\nNúmero da conta: %d\nAgência: %d\nSaldo: R$%.2f", conta1.titular, conta1.getNumeroConta(), conta1.getAgencia(), conta1.getSaldo(), conta1.getSaldo());

        //EX2 - CLASSE IDADEPESSOA
        System.out.println("\n=================================================");
        IdadePessoa idadePessoa1 = new IdadePessoa();
        idadePessoa1.setNomme("Lucas Melo");
        idadePessoa1.setIdade(23);
        idadePessoa1.verificaIdade();

        //EX3 - CLASSE PRODUTO
        System.out.println("\n=================================================");
        Produto feijao = new Produto();
        feijao.setNome("Feijão Carioca");
        feijao.setPreco(45);
        feijao.getPreco();
        System.out.println(feijao.getNome());;
        System.out.println(feijao.getPreco());
        feijao.aplicarDesconto(0.25);
        System.out.println("Preço com desconto: "+feijao.getPreco());

        // AULA 3
        System.out.println("\n=================================================");
        Serie breakingBad = new Serie();
        breakingBad.setNome("Breaking Bad");
        breakingBad.setTemporadas(3);
        breakingBad.setAnoDeLancamento(2012);
        breakingBad.setMinutosPorEpisodio(60);
        breakingBad.setEpisodiosPorTemporada(12);
        breakingBad.setIncluidoNoPlano(true);
        breakingBad.exibeFichaTecnica();
        System.out.println("Duração total: "+breakingBad.getDuracaoEmMinutos());

        System.out.println("\n=================================================");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(breakingBad);
        System.out.println(calculadora.getTempoTotal());

        //EX 1 - CLASSE CARRO
        System.out.println("\n=================================================");
        Carro carro = new Carro();
        carro.setNomeModelo("Celta");
        carro.setPrecoAno1(45550);
        carro.setPrecoAno2(49586);
        carro.setPrecoAno3(55345);
        carro.exibirInfo();

        // EX 2 - CLASSE ANIMAL
        System.out.println("\n=================================================");
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();
        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

    }
}