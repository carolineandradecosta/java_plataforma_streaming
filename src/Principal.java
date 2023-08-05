import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class Principal {

    public static void main(String[] args) {

        // Titulo meuTitulo = new Filme();
        // parou de compilar porque os atributos da classe filme são privados
        // precisamos utilizar os métodos acessores
//        meuFilme.nome = "The Matrix";
//        meuFilme.anoDeLancamento = 1999;
//        meuFilme.duracaoEmMinutos = 135;
//        meuFilme.incluidoNoPlano = true;

//        meuTitulo.setNome("The Matrix");
//        meuTitulo.setAnoDeLancamento(1999);
//        meuTitulo.setDuracaoEmMinutos(135);
//
//        meuTitulo.exibeFichaTecnica();
//        meuTitulo.avalia(9);
//        meuTitulo.avalia(8);
//        meuTitulo.avalia(9);
//
//        System.out.println("Média de avaliações do filme: " + meuTitulo.pegaMedia());
//        System.out.println("Total de avaliações: " + meuTitulo.getTotalDeAvaliacoes());

    Serie lost = new Serie();
    lost.setNome("Lost");
    lost.setAnoDeLancamento(2000);
    lost.setTemporadas(10);
    lost.setEpisodiosPorTemporada(10);
    lost.setMinutosPorEpisodio(50);

    System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

    }

}