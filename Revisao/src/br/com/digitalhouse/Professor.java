package br.com.digitalhouse;

public class Professor {

    private String nome;
    private int rd;

    public Professor(String nome, int rd){
        nome = nome;
        rd = rd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getRd() {
        return rd;
    }

    public void setRd(int rd) {
        this.rd = rd;
    }
}
