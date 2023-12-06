package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    // para fazer o construtor tem que converter pq está vindo tudo como string
    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        // validação para poder lançar a exceção personalizada
        if(meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não consegui convencer o ano porque tem mais de 4 caracteres.");
        }

        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    }

    public void avalia(double nota){
        somaDasAvaliacao += nota;
        totalDeAvaliacoes ++;
    }

    public double pegaMedia(){
        return somaDasAvaliacao / totalDeAvaliacoes;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
            // a clase Título precisou implementar a interface Comparable e reescrever sua propria
            // regra de ordenação, nesse caso o critério é comprar o nome do título com outro


    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento + "," +
                " duração " + duracaoEmMinutos;

    }
}
