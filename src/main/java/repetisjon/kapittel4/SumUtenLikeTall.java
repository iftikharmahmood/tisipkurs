/**
 * 4 Løkke som kontroll strukturer
 * oppgave 4.4
 * oppgave omgjøring av program fra forrige oppgave
 * While løkke bruk
 * Huske verdier fra omløp til omløp i løkken
 */

package repetisjon.kapittel4;

import java.util.Scanner;

public class SumUtenLikeTall {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int dele = 0;
        int tall;
        int runderNr = 0;
        String forrigeTall = "";
        boolean stopp = false;
        String avbryt;



        while (!stopp){

            System.out.println("Skriv et tall. ");
            String tallLest = scanner.next();

            if ((tallLest != "") && (!tallLest.equals(forrigeTall))){
                forrigeTall = tallLest;
                tall = Integer.parseInt(tallLest);
                sum += tall;
                dele++;
            }

            runderNr++;
            System.out.println(" Runde nr " + runderNr);

          //  System.out.println("Skriv et tall. ");
          //  tallLest = scanner.next();

            System.out.println(" Vil du avslutte tast j / n ");
            avbryt = scanner.next();
            if (avbryt.equals("j")) {
                stopp = true;
            }

        }
        System.out.println("Delingstall " + dele);
        System.out.println("Summen av tallene er " + sum );
        System.out.println("Gjennomsnittet av tallene er %d".formatted(sum / dele));
    }
}
/*
* Hvorfor får jeg ikke denne til å fungere ?????
* bare tull med WHILE løkker
*
* Endelig fungerer den etter en hel dags arbeid
 */