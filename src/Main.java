import br.com.marcus.skynet.calculos.CalculadoraDeTempo;
import br.com.marcus.skynet.modelos.Film;
import br.com.marcus.skynet.modelos.Serie;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Film meuFilme = new Film();

        //meuFilme.nome = "O poderoso chefão";
        //meuFilme.anoDeLancamento = 1970;
        //meuFilme.duracaoEmMinutos = 180;
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.exibeFichaTecnica();


        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Media das avaliações: " + meuFilme.pegaMedia());
        // System.out.println(meuFilme.somaDasAvaliacoes);
       // System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println("****************************");
        Serie lost = new Serie();
        lost.setNome("lost");
        lost.setAnoDeLancamento(2003);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpPorTemporada(7);
        lost.setMinutosPorEp(50);
        System.out.println("Duração para maratonar: " + lost.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
    }


}
