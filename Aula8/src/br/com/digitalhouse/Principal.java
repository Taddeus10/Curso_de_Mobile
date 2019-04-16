package br.com.digitalhouse;

import java.util.*;

public class Principal {

    public static void main (String[] args){

        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa tairo = new Pessoa("Tairo", "Roberto", 30);
        Pessoa jessica = new Pessoa("Jessica", "Milena", 18);
        Pessoa vini = new Pessoa("Vini", "PHP", 35);

        pessoas.add(tairo);
        pessoas.add(jessica);
        pessoas.add(vini);

        /*for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobrenome() + "\n");
        }*/

        Set<Pessoa> pessoaSet = new HashSet<>();
        pessoaSet.add(tairo);
        pessoaSet.add(jessica);
        pessoaSet.add(vini);
        pessoaSet.add(vini);
        pessoaSet.add(vini);

        /*for (Pessoa pessoa : pessoaSet) {
            System.out.println("Nome: " + pessoa.getNome() + "\nSobrenome: " + pessoa.getSobrenome() + "\n");
        }*/

        Map<String, Pessoa> stringPessoaMap = new HashMap<>();
        stringPessoaMap.put("tairo", tairo);
        stringPessoaMap.put("jessica", jessica);
        stringPessoaMap.put("vini", vini);
        stringPessoaMap.put("vini", vini);
        stringPessoaMap.put("vini", vini);

        for(String chave : stringPessoaMap.keySet()) {

            System.out.println("Nome: " + stringPessoaMap.get(chave).getNome() +"\nSobrenome: "
                    + stringPessoaMap.get(chave).getSobrenome() +"\n");

        }

    }
}
