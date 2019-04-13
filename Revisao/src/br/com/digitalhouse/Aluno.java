package br.com.digitalhouse;

public class Aluno {

    private String nome;
    private String sobrenome;
    private int ra;

    public Aluno(String nome, String sobrenome, int ra){
        nome = nome;
        sobrenome = sobrenome;
        ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
