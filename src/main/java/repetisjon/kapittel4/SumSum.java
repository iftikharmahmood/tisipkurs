
/**
 * gjør om Sum.java så den bruker do
 * oppgave 4.7 oppgave 1
 * Programmet leser inn heltall fra brukeren og regner ut summen.
 * Brukeren avslutter tallrekken ved å trykke Esc-tasten.
 */

package repetisjon.kapittel4;
import static javax.swing.JOptionPane.*;
public class SumSum {
        public static void main(String[] args) {
            String tallLest;
            int sum = 0;
            do {
                tallLest = showInputDialog("Skriv tall, avslutt med Esc.");
                int tall = Integer.parseInt(tallLest);
                sum += tall;
            } while (tallLest =="666"); {
                    showMessageDialog(null, "Summen er " + sum + ".");
                    System.out.println(" ");
                }
        }
}

// hvorfor fungerer ikke denne ?