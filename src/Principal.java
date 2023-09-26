import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        // parou de compilar porque os atributos da classe filme são privados
        // precisamos utilizar os métodos acessores
//        meuFilme.nome = "The Matrix";
//        meuFilme.anoDeLancamento = 1999;
//        meuFilme.duracaoEmMinutos = 135;
//        meuFilme.incluidoNoPlano = true;


        Titulo meuTitulo = new Filme();
        meuTitulo.setNome("The Matrix");
        meuTitulo.setAnoDeLancamento(1999);
        meuTitulo.setDuracaoEmMinutos(135);

        meuTitulo.exibeFichaTecnica();
        meuTitulo.avalia(9);
        meuTitulo.avalia(8);
        meuTitulo.avalia(9);

//        System.out.println("Média de avaliações do filme: " + meuTitulo.pegaMedia());
//        System.out.println("Total de avaliações: " + meuTitulo.getTotalDeAvaliacoes());

            // instanciando uma série
    Serie lost = new Serie();
    lost.setNome("Lost");
    lost.setAnoDeLancamento(2000);
    lost.setTemporadas(10);
    lost.setEpisodiosPorTemporada(10);
    lost.setMinutosPorEpisodio(50);
    System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

            // instanciando outro filme
    Filme outroFilme = new Filme();
    outroFilme.setNome("O poderoso chefão");
    outroFilme.setAnoDeLancamento(1970);
    outroFilme.setDuracaoEmMinutos(180);

            // testando a Calculadora de Tempo
    CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
    calculadora.inclui(lost);
    calculadora.inclui(meuTitulo);
    calculadora.inclui(outroFilme);
    System.out.println(calculadora.getTempoTotal());

            // testando o Filtro de Recomendação
    FiltroRecomendacao filtro = new FiltroRecomendacao();
    filtro.filtra(outroFilme);

            // instanciando um episódio
    Episodio episodio = new Episodio();
    episodio.setNumero(1);
    episodio.setSerie(lost);
    episodio.setTotalVisualizacoes(300);

            // testando o filtro de recomendação com o novo episódio criado
    filtro.filtra(episodio);

            // instanciando outro filme
    var filmeDoPaulo = new Filme();
    filmeDoPaulo.setNome("Dogville");
    filmeDoPaulo.setDuracaoEmMinutos(200);
    filmeDoPaulo.setAnoDeLancamento(2003);
    filmeDoPaulo.avalia(10);

            // declarando um ArrayList
    ArrayList<Filme> listaDeFilmes = new ArrayList<>();
    listaDeFilmes.add(filmeDoPaulo);
    listaDeFilmes.add(outroFilme);
    System.out.println("Tamanho da lista: " + listaDeFilmes.size());
    System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
    System.out.println(listaDeFilmes);
    System.out.println("to string do filme " + listaDeFilmes.get(0).toString());


    }
}