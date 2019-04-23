package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(null);

        lista.add("Pato");
        lista.add("Cachorro");
        lista.add("Gato");

        for (String list: lista){
            System.out.println(lista.get(2));
        }


        }
    }

