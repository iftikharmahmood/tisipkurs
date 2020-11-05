/** Oppgave 3 programeringsoppgaver kapittel 5.9
 * Lag terningspill for 2 spillere A og B
 * Første spiller som får 100 akkumulerte poeng vinner
 * terningkast 1 nuller ut akkumulerte poeng
 *
 */


package repetisjon.kapittel5;
import java.util.Random;
public class Hundre {

    private int sumPoeng;

    public int kastTerningen(){
        Random terning = new Random();
        return terning.nextInt(6)+1;
    }

    public int spillerA(){
        int resultPlayerA = 0;
        int round = 1;
        int poeng;

        while (resultPlayerA < 100){
            System.out.println( " Runde nummer : " + round + "\n");

            poeng = kastTerningen();

            if (poeng == 1){
                resultPlayerA = 0;
            } else {

                resultPlayerA += poeng;
            }
            System.out.println( " Antall Poeng spiller A: " + resultPlayerA + "\n");
            round++;
        }
        return resultPlayerA;

    }

    public int spillerB(){
        int resultPlayerB = 0;
        int round = 1;
        int poeng;

        while (resultPlayerB < 100){
            System.out.println( " Runde nummer : " + round + "\n");
            poeng = kastTerningen();
            if (poeng == 1){
                resultPlayerB = 0;
            } else {
                resultPlayerB += poeng;
            }
            System.out.println( " Antall Poeng spiller B: " + resultPlayerB + "\n");
            round++;
        }
        return resultPlayerB;
    }

    public void erFerdig(){
       int resultPlayerA = 0;
       int resultPlayerB = 0;

        while (resultPlayerA < 100 || resultPlayerB < 100){
            resultPlayerA = spillerA();
            resultPlayerB = spillerB();
        }

        if ( resultPlayerA > resultPlayerB){
            System.out.println(" Vinneren er spiller A, med et poengresultat på " + resultPlayerA + "\n");
        } else {
            System.out.println(" Vinneren er spiller B, med et poengresultat på " + resultPlayerB + "\n");
        }
    }
}