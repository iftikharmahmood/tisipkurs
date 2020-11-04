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
        Random terning = new Random(17);

        int kastTerning = terning.nextInt(5)+1;

        if (kastTerning == 1){
            kastTerning = 0;
        }
        return kastTerning;
    }

    public int spillerA(){
        int resultPlayerA = 0;
        int round = 1;

        while (resultPlayerA < 100){
            System.out.println( " Runde nummer : " + round + "\n");
            resultPlayerA += kastTerningen();
            System.out.println( " Antall Poeng spiller A: " + resultPlayerA + "\n");
            round++;
        }
        return resultPlayerA;

    }

    public int spillerB(){
        int resultPlayerB = 0;
        int round = 1;

        while (resultPlayerB < 100){
            System.out.println( " Runde nummer : " + round + "\n");
            resultPlayerB += kastTerningen();
            System.out.println( " Antall Poeng spiller B: " + resultPlayerB + "\n");
            round++;
        }
        return resultPlayerB;
    }




    public int erFerdig(int resultPlayerA, int resultPlayerB){

        if ( resultPlayerA > resultPlayerB){
            System.out.println(" Vinneren er spiller A, med et poengresultat på " + resultPlayerA + "\n");
        } else {
            System.out.println(" Vinneren er spiller B, med et poengresultat på " + resultPlayerB + "\n");
        }

        return  result;

    }

}


/*    */

   /* public int spill(){

        int result = kastTerningen();
        if (result == 1){
            result = 0;
        } else {
            result += result;
        }
        return result;
    } */