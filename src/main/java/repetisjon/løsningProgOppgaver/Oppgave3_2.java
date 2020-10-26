package repetisjon.løsningProgOppgaver; /**
 * Oppgave3_2.java - "Programmering i Java", 4.utgave - 2010-02-22
 *
 * Leser inn et tall og analyserer det.
 */
import static javax.swing.JOptionPane.*;

public class Oppgave3_2 {
  public static void main(String[] args) {
    final int DIVISOR = 2; // delelig med?
    final int NEDRE_GRENSE = 0; // nedre grense lukket intervall
    final int ØVRE_GRENSE = 10; // �vre grense lukket intervall

    /* Leser inn et tall fra brukeren. */
    String tallLest = showInputDialog("Angi et heltall som skal analyseres:");
    int tall = Integer.parseInt(tallLest);

    /* Analyserer tallet. Bygger opp resultatutskriften trinnvis.*/
    String resultat = "Analyse av tallet " + tall + ":\n\n";

    resultat += "Tallet er ";
    if (tall <= 0) {
      resultat += "ikke-";
    }
    resultat += "positivt.\n";

    resultat += "Tallet er ";
    if (tall % DIVISOR != 0) {
      resultat += "ikke ";
    }
    resultat += "delelig med " + DIVISOR + ".\n";

    resultat += "Tallet befinner seg ";
    if (tall < NEDRE_GRENSE || tall > ØVRE_GRENSE) {
      resultat += "ikke ";
    }
    resultat += "i det lukkede intervallet [" + NEDRE_GRENSE + ", " + ØVRE_GRENSE + "].";

    /* Skriver ut resultatene. */
    showMessageDialog(null, resultat);
    System.out.println(resultat);
  }
}

/* Kj�ring av programmet:
***Inndata: Angi et heltall som skal analyseres: -6

Analyse av tallet -6:

Tallet er ikke-positivt.
Tallet er delelig med 2.
Tallet befinner seg ikke i det lukkede intervallet [0, 10].
*/