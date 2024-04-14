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


    }
}