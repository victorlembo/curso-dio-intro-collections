package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import br.com.dio.collection.list.Gato;

public class ExemploOrdenacaoList {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>();
        meusGatos.add(new Gato("Jon", 18, "preto"));
        meusGatos.add(new Gato("Simba", 6, "tigrado"));
        meusGatos.add(new Gato("Jon", 12, "amarelo"));

        System.out.println(meusGatos);


        System.out.println("Ordem de insercao");
        System.out.println(meusGatos);

        System.out.println("Ordem Aleatoria");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural dos nomes");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem de Idade");
       // Collections.sort(meusGatos, new ComparatorIdade() );
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Odem de cor");
        // Collections.sort(meusGatos, new ComparatorCor() );
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem por Nome, cor e idade");
        // Collections.sort(meusGatos, new ComparatorCor() );
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);



    }
}

