package br.com.digitalhouse;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Integer numero;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o  número:");
        numero = scanner.nextInt();

        if(numero % 2 == 1 && numero > 10){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
