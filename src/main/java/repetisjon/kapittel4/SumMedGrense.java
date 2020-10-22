/**Kapittel 4 etterlikning av progranliste 4.5
 * Oppgave til kapittel 4.10
 * Utvid programmet slik at sluttresultatet viser hva som avsluttet løkken.
 */
package repetisjon.kapittel4;

import static javax.swing.JOptionPane.*;

public class SumMedGrense {

    public static void main(String[] args) {

        int sum = 0;
        boolean grense = false;

        System.out.println("Hvis programmet avsluttes og du ikke får noen resultater, men en feilmelding har du enten ikke tastet inn en verdi,");
        System.out.println("eller du har skrevet tall med komma");

        String tallLest = showInputDialog(" Tast inn et tall av gangen, eller avslutt med ESC tasten");

        while ((tallLest != null) && (!grense) ){
            int tall = Integer.parseInt(tallLest);
            sum += tall;
           // tallLest = showInputDialog(" Tast inn et tall av gangen, eller avslutt med ESC tasten");
            if (sum > 15){
                grense = true;
            } else {
                tallLest = showInputDialog(" Tast inn et tall av gangen, eller avslutt med ESC tasten");
            }
        }
        if (sum > 15) {
            showMessageDialog(null, "Løkken ble avbrutt av at summen er høyere en 15, summen er " + sum);
        } else {
            showMessageDialog(null, "Løkken ble avbrutt av ESC tasten, summen er  " + sum);

        }
    }
}
/** Fasit Hvorfor og hvordan fungerer denne ? hva er logikken bak melding+=(tallLest==null) ?
 *  Kapittel 4.10
 * Oppgave 1
 * Linje 28–29 skiftes ut med:
 *   * Skriver ut resultatet *
 * String melding="Summen er "+sum;
 * melding+=(tallLest==null)?", brukeren har tastet Esc-tasten."
 * :", grensen ("+GRENSE+") er overskredet.";
 * showMessageDialog(null,melding);
 */
