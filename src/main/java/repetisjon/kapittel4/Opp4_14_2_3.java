/**
 * Kapittel 4.14
 * oppgave 2.3
 * Lag et program som som skriverut tallverdiene for et intervall av tegn
 * Spør brukeren om Øvre og nedre verdi leses inn fra bruker
 */
package repetisjon.kapittel4;

import java.util.Scanner;

public class Opp4_14_2_3 {
    private final Scanner scanner = new Scanner(System.in);
    private int nedre;
    private int ovre;

    public static void main(String[] args) {
        Opp4_14_2_3 alphaNum = new Opp4_14_2_3();
        alphaNum.lesInnVerdier();
        alphaNum.scanner.close();
        alphaNum.skrivUt();
    }

    public void lesInnVerdier(){
        System.out.println(" Tast inn den laveste bokstav verdien i alfabetintervallet  ");
        String nedre1 = scanner.next();
        char tegn = nedre1.charAt(0);
        nedre = tegn;
        System.out.println(" Tast inn den høyeste bokstav verdien i alfabetintervallet  ");
        String ovre1 = scanner.next();
        char tegn2 = ovre1.charAt(0);
        ovre = tegn2;
    }

    public void skrivUt(){
        char bokstav;
        for (int i= nedre; i < ovre; i++ ){
            bokstav = (char) i;
            System.out.println("Bokstaven " + bokstav + " har tallverdien " + i + " i UTF-8 tabellen");
        }
    }
}
