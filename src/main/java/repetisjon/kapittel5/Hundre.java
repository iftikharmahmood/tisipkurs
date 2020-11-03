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
        Random terning = new Random(3);

        int kastTerning = terning.nextInt(5)+1  ;

        return kastTerning;
    }


    public int erFerdig(){
        int result;

        return  result;

    }

    public int spill(){

        int result = kastTerningen();
        if (result == 1){
            result = 0;
        } else {
            result += result;
        }



    }

}
