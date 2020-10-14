/**
 * Kapittel 3.4 valgstrukturer
 * oppgave 3.4 1a
 */
package repetisjon.kapittel3;

import java.util.Scanner;

public class Valgstrukturer {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tast inn et antall av XXX");
        double antallet= scanner.nextDouble();
        scanner.close();

        char kode;

        if (antallet >= 20){
            kode = 'M';
        } else {
            kode = 'F';
        }

        System.out.println(kode);
    }
}
