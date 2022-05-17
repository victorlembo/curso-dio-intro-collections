package br.com.dio.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        System.out.println("Ordem Aleatoria");
        Set<Serie> minhasSeries = new HashSet<>();
        minhasSeries.add(new Serie("got", "fantasia", 60));
        minhasSeries.add(new Serie("dark", "drama", 60));
        minhasSeries.add(new Serie("that 70 show", "comedia", 25));

        for(Serie serie : minhasSeries){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem de Insercao");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>();
        minhasSeries1.add(new Serie("got", "fantasia", 60));
        minhasSeries1.add(new Serie("dark", "drama", 60));
        minhasSeries1.add(new Serie("that 70 show", "comedia", 25));

        for(Serie serie : minhasSeries1){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());

        }


        System.out.println("\nOrdem Natural por tempo de episodio");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie : minhasSeries2){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());

        }

        System.out.println("\nOrdem Nome, Genero, TempoEpisodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for(Serie serie : minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());

        }
    }
}

