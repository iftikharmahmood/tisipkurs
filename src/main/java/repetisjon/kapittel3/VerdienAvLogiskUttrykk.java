/**
 * Kapittel 3.7 Logiske uttrykk
 * oppgave 3
 */
package repetisjon.kapittel3;

import java.util.Scanner;

public class VerdienAvLogiskUttrykk {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Målet er å vise om utrykket er sann eller usann");
        System.out.println(" a==20 || a >= 0 && a <= 10 || a >= 15 && a <= 20 || a > 100");
        System.out.println(" Test data : 17, 120, -30");
        System.out.println("tast inn en verdi i tall");
        int a = scanner.nextInt();

        boolean uttrykk = ((a==20) || (a >= 0 && a <= 10) || (a >= 15 && a <= 20) || (a > 100));
        if (uttrykk){
            System.out.println(" Gritt verdien av a er: " +a);
            System.out.println(" Er uttrykket SANN");
        } else {
            System.out.println(" Gritt verdien av a er: " +a);
            System.out.println(" Er uttrykket USANN");
        }
    }
}
