/**
 * 4 Løkke som kontroll strukturer
 * oppgave 4.4
 * oppgave omgjøring av program fra programsliste 4.2
 * While løkke bruk
 * Huske verdier fra omløp til omløp i løkken
 * * Programmet leser inn heltall fra brukeren og regner ut summen.
 *  * Hvis flere like tall følger etter hverandre, tas de med bare én gang
 *  * i summen. Brukeren avslutter tallrekken med Esc.
 */
package repetisjon.kapittel4;

import java.util.Formatter;

import static javax.swing.JOptionPane.*;

public class SumUtenLikeTallTakeII {
    public static void main(String[] args) {


        int antallTallSummert = 0;
        int sum = 0;
        int antallRunder = 0;
        String forrigeTallLest = "";

        String tallLest = showInputDialog("Skriv ett tall av gangen, avslutt med Esc: ");

        /* Gå i løkke så lenge som Esc ikke er tastet */
        while (tallLest != null) {
            if (!tallLest.equals(forrigeTallLest)) {
                int tall = Integer.parseInt(tallLest);
                sum += tall;
                antallTallSummert++;
            }
            antallRunder++;
            forrigeTallLest = tallLest; // tar vare på siste innleste tall
            tallLest = showInputDialog("Skriv ett tall av gangen, avslutt med Esc: ");
        }
        showMessageDialog(null, "Summen er " + sum
                + ". Vi har summert " + antallTallSummert + " tall.");
        showMessageDialog(null," Snittet av tall som summeres = %d".formatted(sum / antallTallSummert));
        showMessageDialog(null,"Gjennomsnitt av samtlige tall %d".formatted(sum / antallRunder));
    }
}

/* Eksempler på kjøring:
Kjøring 1:
Skriv tall, avslutt med Esc.
3 3 3 3
Summen er 3. Vi har summert 1 tall.

Kjøring 2:
Skriv tall, avslutt med Esc.
1 7 3 3 3 2
Summen er 13. Vi har summert 4 tall.110

*/