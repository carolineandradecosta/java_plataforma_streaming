package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

            // usa o pilimorfismo e escreve apenas um método
    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }
//    public void inclui(Filme filme){
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//
//    }
//
//    public void inclui(Serie serie){
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//
//    }

    public int getTempoTotal() {
        return this.tempoTotal;
    }
}
