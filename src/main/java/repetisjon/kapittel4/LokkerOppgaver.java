
/**
 * 4 Løkke som kontroll strukturer
 * oppgave 4.6
 * oppgave 1 rett opp og gjør om til for løkke
 */

package repetisjon.kapittel4;

public class LokkerOppgaver {

    public static void main(String[] args) {


        int dag = 1;
         /*    was
        while (dag < 5){
            System.out.println("En eller annen tekst. Det er dag nr "+ dag + " idag");
        } */

        //   IS
       /* for (;dag < 5; dag++ ){
            System.out.println("En eller annen tekst. Det er dag nr "+ dag + " idag");
        }

        for (double vinkel = 0.0; vinkel < (Math.PI * 0.5)+0.01;vinkel+=0.5){
            System.out.println(" Sinus til vinkel " + vinkel + " grader, er radianer  " + Math.sin(vinkel));
        }*/

        for (double vinkel = 0.0; vinkel < (Math.PI * 1                                                                                                                                                                                   )+0.01;vinkel+=1){
            System.out.println(" Sinus til vinkel " + vinkel + " grader, er radianer  " + Math.sin(vinkel));
        }



    }
}
