package br.com.digitalhouse;

public class Pessoa {

    private Integer rg;
    private String nome;

    public Pessoa() {
    }

    public Pessoa(Integer rg, String nome) {
        this.rg = rg;
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object outraPessoa) {

        if (!(outraPessoa instanceof Pessoa)) {
            return false;

        }

        if (((Pessoa) outraPessoa).getRg() == this.getRg() &&
                ((Pessoa) outraPessoa).getNome().equals(getNome())){
            return true;
        }
        return false;

    }
}
