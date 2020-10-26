package repetisjon.løsningProgOppgaver; /**
 * Oppgave4_6.java - "Programmering i Java", 4.utgave - 2010-02-22
 *
 * Program som omformer mellom heltallssystem og et hvilket som helst annet
 * tallsystem med grunntall 2-9. Programmet g�r i l�kke og kan konvertere
 * flere tall til det samme systemet.
 *
 */
import static javax.swing.JOptionPane.*;
public class Oppgave4_6 {
  public static void main(String[] args) {

    /* Leser inn det nye systemets grunntall. */
    int grunntall = 1;
    do {
      String grunntallLest = showInputDialog("Angi grunntall for det nye tallsystemet [2-9]:");
      grunntall = Integer.parseInt(grunntallLest);
    }
    while (grunntall < 2 || grunntall > 9);

    /* Leser inn tall som skal konverteres fra 10-tallsystemet til det nye systemet. */
    String tallLest = showInputDialog("Skriv et heltall, avslutt med Esc:");
    while (tallLest != null) {
      int tall = Integer.parseInt(tallLest);

      /* Konverterer til nytt tallsystem */
      String resultat = "";
      do {
        resultat = tall % grunntall + resultat;
        tall /= grunntall;
      } while (tall != 0);

      /* Skriver ut resultatet og leser inn neste tall. */
      showMessageDialog(null, "Omformer " + tallLest + " fra 10-tallsystemet til " + grunntall + "-tallsystemet: " + resultat);
      tallLest = showInputDialog("Skriv et heltall, avslutt med Esc:");
    }
  }
}

/* Kj�ring av programmet:
***Inndata: Skriv heltall: 279
***Inndata: Angi grunntall for det nye tallsystemet.
            Taller m� befinne seg i lukket intervall 2-9: 2
2-tallsystem: 100010111
(Se flere eksempler i vedlegg E.)
*/