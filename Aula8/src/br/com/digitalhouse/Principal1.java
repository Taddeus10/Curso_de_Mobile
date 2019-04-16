package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal1 {

    public static void main (String[] agrs){

        List<Exercicio1> exercicio1s = new ArrayList<>();
        Exercicio1 lot = new Exercicio1("Ovo");
        Exercicio1 lot1 = new Exercicio1("Água");
        Exercicio1 lot2 = new Exercicio1("Escopeta");
        Exercicio1 lot3 = new Exercicio1("Cavalo");
        Exercicio1 lot4 = new Exercicio1("Dentista");
        Exercicio1 lot5 = new Exercicio1("Fogo");


        Map<Integer, Exercicio1> integerExercicio1HashMap = new HashMap<>();
        integerExercicio1HashMap.put(0,lot);
        integerExercicio1HashMap.put(1, lot1);
        integerExercicio1HashMap.put(2, lot2);
        integerExercicio1HashMap.put(3, lot3);
        integerExercicio1HashMap.put(4, lot4);
        integerExercicio1HashMap.put(5, lot5);

        for (Integer lor : integerExercicio1HashMap.keySet()){
            System.out.println("Loteria: " + integerExercicio1HashMap.get(lor).getLot());
        }



        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();

        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");

        List<String> apelidosMiguel = new ArrayList<>();

        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");

        List<String> apelidosMaria = new ArrayList<>();

        apelidosMaria.add("Wonder Watch");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");

        List<String> apelidosLucas = new ArrayList<>();

        apelidosLucas.add("Lukinha");
        apelidosLucas.add("Jorge");
        apelidosLucas.add("George");

        apelidos.put("Joao", apelidosJoao);
        apelidos.put("Miguel", apelidosMiguel);
        apelidos.put("Maria", apelidosMaria);
        apelidos.put("Lucas", apelidosLucas);

        for (String chave : apelidos.keySet()) {
            System.out.println("\nApelidos: " + chave);
            for (String apelido : apelidos.get(chave)){
                System.out.println("\t" + apelido);
            }
        }

    }

}
