/**
 * Kapittel 2.13
 * oppgave 1 konvertere måleenheter
 */

package repetisjon.kapittel2;

import java.util.Scanner;

public class CentiTommer {
    public static final double FAKTOR = 2.54;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Tast inn tommer som skal konverteres til centimeter :" );
        double tommerInn = scanner.nextDouble();
        if (tommerInn !=0){
            System.out.println(tommerInn + " Tommer blir : " + (tommerInn * FAKTOR) + " centimeter");
            System.out.println();
        }
        else {
            System.out.println("Du kan ikke operere med null enheter ");
            }

        System.out.println(" Tast inn centometer som skal konverteres til tommer :" );
        double centimeterInn = scanner.nextDouble();
        scanner.close();

        if (centimeterInn !=0) {
            System.out.println(centimeterInn + " Centimeter blir : " + (centimeterInn / FAKTOR) + " tommer");
        }
        else {
            System.out.println("Du kan ikke operere med null enheter ");
        }
    }
}
