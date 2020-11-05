package repetisjon.kapittel5.NyeLøsninger;

import java.util.Random;

public class Spiller {

    private int sumPoeng;
    private  String spillerNavn;

    public Spiller(String spillerNavn) {
        this.spillerNavn = spillerNavn;
    }

    public String getSpillerNavn() {
        return spillerNavn;
    }

    public int getSumPoeng() {
        return sumPoeng;
    }

    public void kastTerningen(){
        int poeng;
        Random terning = new Random();
        poeng = terning.nextInt(6)+1;
        if (poeng == 1){
            sumPoeng = 0;
        } else {
            sumPoeng += poeng;
        }

    }

    public boolean erFerdig(){
        boolean ferdig = false;

        if (sumPoeng >=100){
            ferdig = true;
        }
        return ferdig;
    }


}
