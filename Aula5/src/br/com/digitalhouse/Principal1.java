package br.com.digitalhouse;

public class Principal1 {

    public static String maeDe(Filho filho){
        return filho.getMae();

    }

    public static String paiDe(Filho filho){
        return filho.getPai();

    }

    public static boolean temAmesmaMae(Filho filho, Filho filho2){
        if(maeDe(filho) == maeDe(filho2)){
            return true;
        }else{
            return false;
        }

    }

    public static boolean temOmesmoPai(Filho filho, Filho filho2){
        if(paiDe(filho) == paiDe(filho2)){
            return true;
        }else{
            return false;
        }

    }

    public static boolean saoMeioIrmaos(Filho filho, Filho filho2){
        return temAmesmaMae(filho, filho2) && !temOmesmoPai(filho, filho2)
                || !temAmesmaMae(filho, filho2) && temOmesmoPai(filho, filho2);
    }

    public static void main(String[] args){

        Filho filhoUM = new Filho("Maria", "Jorge", "Jose");
        Filho filhoDois = new Filho("Maria", "Fernando", "Ricardo");

        System.out.println(saoMeioIrmaos(filhoUM,filhoDois));

    }
}
