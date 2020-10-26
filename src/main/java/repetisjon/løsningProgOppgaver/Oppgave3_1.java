package repetisjon.løsningProgOppgaver; /**
 * Oppgave3_1.java - "Programmering i Java", 4.utgave - 2010-02-22
 *
 * Denne klassen har oversikt over hvilke rom som skal benyttes hos
 * ligningskontoret avhengig av en persons f�dselsdato.
 */
import static javax.swing.JOptionPane.*;

public class Oppgave3_1 {
  public static void main(String[] args) {

    /* Leser inn f�dselsdag. */
    String lestDag = showInputDialog("Skriv inn f�dselsdag (1-31):");
    int fødselsdag = Integer.parseInt(lestDag);

    /* Bestemmer romnr */
    int romnr = 0;
    if (fødselsdag> 25) {
      romnr = 134;
    } else if (fødselsdag > 14) {
      romnr = 125;
    } else if (fødselsdag > 8) {
      romnr = 120;
    } else {
      romnr = 113;
    }

    /* Skriv ut hvilket rom som skal benyttes. */
    showMessageDialog(null, "Benytt rom " + romnr);
  }
}

/* Kj�ring av programmet:
***Inndata: Skriv inn f�dselsdag (1-31): 28
Benytt rom 134
*/