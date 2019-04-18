package br.com.digitalhouse;

public class Aluno {

    private int ra;
    private String nome;
    private String sobrenome;
    private Curso curso;

    public Aluno() {

    }

    public Aluno(int ra, String nome, String sobrenome, Curso curso) {
        this.ra = ra;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object outroAluno) {

        if (!(outroAluno instanceof Aluno)) {

            return false;
        }
        if (((Aluno) outroAluno).getRa() == this.getRa() &&
                ((Aluno) outroAluno).getNome().equals(this.getNome())){

            return true;

        }
            return false;

    }

    @Override
    public int hashCode() {
        return ra + nome.hashCode();
    }

    @Override
    public String toString() {
        return "Ra: " + getRa() +
                "\nNome: " + getNome() +
                "\nSobrenome: " + getSobrenome() +
                "\nCurso: " + getCurso().getNome();

    }
}
