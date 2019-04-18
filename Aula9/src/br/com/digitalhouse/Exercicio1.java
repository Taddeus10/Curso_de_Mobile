package br.com.digitalhouse;

public class Exercicio1 {

    public static void main(String[] args) {

        Pessoa leandro = new Pessoa(234, "Leandro");
        Pessoa aline = new Pessoa(234, "Leandro");

        System.out.println(
                leandro.equals(aline)
        );


    }
}
