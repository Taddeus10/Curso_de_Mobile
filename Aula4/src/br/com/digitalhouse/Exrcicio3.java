package br.com.digitalhouse;

public class Exrcicio3 {
    public static void main(String[] args){

        Integer numeros[] = new Integer[10];
        Integer soma = 1;

        for(int i = 0; i > numeros.length; i++){
            soma = numeros[i] + soma;
        }System.out.println(soma);
    }
}
