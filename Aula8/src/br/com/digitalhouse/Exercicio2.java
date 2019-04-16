package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {

    public static void main (String[] args){

        List<Integer> numeros = new ArrayList();
        numeros.add(1);
        numeros.add(5);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(8);
        numeros.add(8);

        for (int numero : numeros) {
            System.out.println("Numeros: " + numero);

        }
        System.out.println("\n");

        Set<Integer> numeros1 = new HashSet<>();
        numeros1.add(1);
        numeros1.add(5);
        numeros1.add(5);
        numeros1.add(6);
        numeros1.add(7);
        numeros1.add(8);
        numeros1.add(8);
        numeros1.add(8);

        for (int numero : numeros1) {
            System.out.println("Numeros: " + numero);

        }



    }
}
