package br.com.digitalhouse;

public class Dono {

    private String nome;
    public String sexo;

    //construtor especifico
    public Dono(String novoNome){
        nome = novoNome;
    }

    //alimentar
    public void alimentar(Cachorro cachorrinho){
        System.out.println("Óla " + cachorrinho.nome);
    }

    //Get - ASSESSOR
    public String getNome(){
        return nome;
    }

    //Set - Modificador - para modificação não é necessario retorno
    public void setNome(String novoNome){
        nome = novoNome;

    }

    //constutor padrao
    public Dono(){

    }
}
