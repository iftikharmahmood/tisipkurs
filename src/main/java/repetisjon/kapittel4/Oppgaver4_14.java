/**Kapittel 4.14
 * oppgave 1
 * Lag et program som skriver ut multiplikassjonstabellen
 * 13 - 15 gangern
 */
package repetisjon.kapittel4;


public class Oppgaver4_14 {

    public static void main(String[] args) {
        int tretten;
        int fjorten;
        int femten;

        //beregninger og utskrift
        System.out.println(" Multiplikasjonstabell 13 ganger`n ");
        for (int i = 1; i <=10; i++){
            tretten = 13 * i;

            System.out.println("13 X "+ i+ " = " + tretten );
        }
        System.out.println();
        System.out.println();

        System.out.println(" Multiplikasjonstabell 14 ganger`n ");
        for (int i = 1; i <=10; i++){
            fjorten = 14 * i ;
            System.out.println("14 X "+ i+ " = " + fjorten );
        }
        System.out.println();
        System.out.println();

        System.out.println(" Multiplikasjonstabell 15 ganger`n ");
        for (int i = 1; i <=10; i++){
            femten = 15 * i;
            System.out.println("15 X "+ i+ " = " + femten );
        }



    }

}
