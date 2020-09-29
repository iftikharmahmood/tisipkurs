/**
 * Kapittel 2.13
 * oppgave 2
 */

package repetisjon.kapittel2;

import java.util.Scanner;

public class TilSekunder {

    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Tast inn timer");
            int timer = scanner.nextInt();
            System.out.println("Tast inn muntter");
            int minutter = scanner.nextInt();
            System.out.println("Tast inn sekunder");
            int sekunder = scanner.nextInt();
            scanner.close();
            int sekunderTotal = sekunder +(minutter *60)+(timer * 120);

            System.out.println();
            System.out.println(timer + " timer pluss " + minutter + " minutter pluss " + sekunder + " sekunder blir " + sekunderTotal + " Totalt antall sekunder");

            System.out.println("*********************************************************************************************************************");
            System.out.println(" What a mess  :-D");
    }
}