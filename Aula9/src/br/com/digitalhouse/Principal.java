package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Principal {

    public static void main (String[] args){

        /*Curso */
        Curso fullStack = new Curso("FullStack - muito massa");
        Curso mobileAndroid = new Curso("MobileAndroid - muito massa tb");

        /*Alunos */
        Aluno leandro = new Aluno(1, "Leandro", "Oliveira", mobileAndroid);
        Aluno le = new Aluno(5, "Leandro", "Oliveira", mobileAndroid);
        Aluno vini = new Aluno(2, "Vini", "Oliveira", fullStack);
        Aluno tairo = new Aluno(3, "Tairo", "Almeida", mobileAndroid);
        Aluno ana = new Aluno(4, "Ana", "Beatriz", fullStack);

        /*Lista de alunos */
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(leandro);
        alunos.add(le);
        alunos.add(vini);
        alunos.add(tairo);
        alunos.add(ana);

        System.out.println(//leandro.equals(le)//
                 //alunos.contains(le)
                //le
                alunos
        );

    }
}
