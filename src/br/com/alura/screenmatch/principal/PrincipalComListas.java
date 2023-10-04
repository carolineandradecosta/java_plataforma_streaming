package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        var meuTitulo = new Filme("The Matrix", 1999);
        meuTitulo.avalia(9);

        var outroFilme = new Filme("O poderoso chefão", 1970);
        outroFilme.avalia(6);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);

        var lost = new Serie("Lost", 2000);


        //ArrayList<Titulo> lista = new ArrayList<>();
        // Lista é uma interface, é mais comum utilizar dessa forma
        // LinkedLista é uma lista ligada  que faz o mesmo trabalho do ArrayList
        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
                // o instanceof verifica se o item é um filme e automaticamente declara uma variável para fazer um casting
                // e mostra apenas os filmes com classificação maior que 2

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
                // o Collections.Sort(lista) não compilava pq não existia uma regra de comparação

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
                // forma mais moderna para realizar comparações

        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
