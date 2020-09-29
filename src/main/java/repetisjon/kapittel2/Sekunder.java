/**
 * Kapittel 2.13
 * oppgave 3
 */

package repetisjon.kapittel2;

import java.util.Scanner;

public class Sekunder {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tast inn et stort antall sekunder");
        double sekunder = scanner.nextDouble();
        scanner.close();

        double minutter = sekunder / 60;
        double timer = minutter / 60;
        double doyn = timer / 60;
        double uke = doyn / 24;
        double maaned = uke / 7;
        double aar = maaned / 12;

        System.out.println((int)sekunder + " Sekunder blir: " +(int)minutter + " hele minutter, " + "og " + (int)timer + " hele timer.");
        System.out.println(" Som igjen blir: " + (int)doyn + ", hele døgn, " + (int)uke + ", hele uker, " + (int)maaned + ", hele måneder og " + (int)aar + " hele år");

        System.out.println("*********************************************************************************************************************");
        System.out.println(" The real mess  :-D");

        System.out.println("år       : " + aar);
        System.out.println("måned    : " + maaned);
        System.out.println("Uker     : " + uke);
        System.out.println("Døgn     : " + doyn);
        System.out.println("Timer    : " + timer);
        System.out.println("Minutter : " + minutter);
    }
}
