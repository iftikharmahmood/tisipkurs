
/**
 * gjør om Sum.java så den bruker bare wile
 * oppgave 4.7 oppgave 2
 * Programmet leser inn heltall fra brukeren og regner ut summen.
 * Brukeren avslutter tallrekken ved å trykke Esc-tasten.
 */

package repetisjon.kapittel4;
import static javax.swing.JOptionPane.*;
public class SetningII {
    public static void main(String[] args) {

        String setning ="";
        String ord = " ";
        while ( ord != null){
            ord = showInputDialog(" Skriv et ord, eller avslutt ,med ESC");
            setning += (ord + " ");
        }
        showMessageDialog(null,setning);
    }
}
// ja Definitivt denne blir mye bedre med bare while løkke