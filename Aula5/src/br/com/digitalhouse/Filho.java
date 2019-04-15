package br.com.digitalhouse;

public class Filho {

    private String mae;
    private String pai;
    private String filho;

    public  Filho(String nomeMae, String nomePai, String nomeFilho){
        mae = nomeMae;
        pai = nomePai;
        filho = nomeFilho;
    }


    public void setFilho(String filho) {
        this.filho = filho;
    }

    public String getFilho() {
        return filho;
    }

    public String getMae(){
        return mae;
    }

    public String getPai(){
        return pai;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

}
