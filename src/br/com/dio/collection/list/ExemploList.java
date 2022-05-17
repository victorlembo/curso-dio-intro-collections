package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {


        System.out.println("Crie uma lista e adicione sete notas: ");

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.0);
        notas.add(9.0);
        notas.add(5.0);
        notas.add(4.0);
        notas.add(9.5);
        notas.add(0.0);
        System.out.println(notas);

        System.out.println("Exiba a posicao da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posicao 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5 pela nota 7");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5 esta na lista: " + notas.contains(5d));

        System.out.println("Exiba a teerceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double sum = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            sum += next;
        }

        System.out.println("Exiba a soma dos valores: " + sum);


        System.out.println("Exiba a media das notas: " + sum/notas.size());

        System.out.println("Remova a nota zero: " );
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota na posicao zero: " );
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }

        }
        System.out.println(notas);

        System.out.println("Apague toda lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());



    }
}


