/** Programeringsoppgave kapittel 9.9
 * oppgave 1
 * Lag en lasse Prosjekt.
 * initier med følgende String Prosjekttittel, String ansvarligNavn, double budsjett
 * lag getters og setters
 * lag en tostringmetode
 *
 * Klienten skal lage et prosjektobjekt og legge inn flere påløpte beløp
 * for hver oppdatering skal all prosjektinformasjon skrives ut.
 */

package repetisjon.kapittel5;

import java.util.Scanner;

public class ProsjektMain {

    public static void main(String[] args) {
        double beløp;
        Scanner scanner = new Scanner(System.in);
        Prosjekt prosjektet = new Prosjekt("Det første prosjektet", "Flittig Per", 30000);

        System.out.println(" Prosjektstatus ved oppstart for: " + prosjektet.getProsjektittel());
        System.out.println(" Juridisk ansvarlig: " + prosjektet.getAnsvarligNavn());
        System.out.println(" Grunnkostnad ved oppstart av prosjektet: " + prosjektet.getBudsjett() + ". kroner");

        System.out.println(" Tast inn beløpet for påløpte kostnader ");
        prosjektet.oppdaterBudsjett(scanner.nextDouble());
        System.out.println(prosjektet.toString());

    }


}
