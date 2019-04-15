package br.com.digitalhouse;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Integer umNumeroA;
        Integer umNumeroB;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        umNumeroA = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        umNumeroB = scanner.nextInt();

        if (umNumeroA < umNumeroB) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }
    }
}
