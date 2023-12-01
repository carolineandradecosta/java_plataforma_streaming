package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca:");
        var busca = leitura.nextLine();

        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=246c131b";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

                // guardando em uma variável o json que é o response.body();
        String json = response.body();
        System.out.println(json);

                // criando uma instância da classe Gson
                // essa classe foi baixada separadamente e adicionada ao projeto
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
                // Desserialização: recebe um json e transforma em uma classe do tipo Titulo
        //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        // eu quero continuar utilizando o "meuTitulo" pq é um título e a classe título está mais completa
        // a classe títuloOmdb é como se fosse uma classe fazer fazer o intermédio
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println("Título já convertido");
        System.out.println(meuTitulo);

    }
}
