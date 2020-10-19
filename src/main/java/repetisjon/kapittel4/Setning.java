/**
 * 4 Løkke som kontroll strukturer
 * oppgave 4.6
 * Siste oppgave
 */
package repetisjon.kapittel4;

import java.util.Scanner;

public class Setning {

    public static void main(String[] args) {
        //scanner leset ikke null verdi derfor vil ikke denne kontrollen fungerer
        Scanner scanner = new Scanner(System.in);

        System.out.println(" skriv noen ord og bygg opp setning når du taster 0 i begynnelsen av et ord, vil programmet stoppe ");
        String ord= "";
        String setning ="";

       /* do{
            System.out.println("Tast inn et ord: ");
            ord = scanner.next();
            setning += (ord + " ");
        } while (ord != null);
            System.out.println(setning);


        */
// hvorfor funker ikke dette ?
        while (ord != "5"){
            System.out.println("Tast inn et ord: ");
            ord = scanner.next();
            setning += (ord + " ");
        }
        System.out.println(setning);



    }
}
