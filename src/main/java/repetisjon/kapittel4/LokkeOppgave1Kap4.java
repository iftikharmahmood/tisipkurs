/**
 * 4 Løkke som kontroll strukturer
 * oppgave 4.3
 * oppgave 1
 * programliste 4.1
 * While løkke bruk
 * utvid til å regne gjennomsnitt
 *
 */
package repetisjon.kapittel4;

import static javax.swing.JOptionPane.*;

public class LokkeOppgave1Kap4 {

    public static void main(String[] args) {
        //NumberFormat format = new DecimalFormat("#0.00");
        int sum = 0;
        int dele = 0;
        String tallLest = showInputDialog("Skriv et tall, eller avslutt med ESC.");
        if (tallLest != null){
            dele++;
        }
        while (tallLest != null){
            int tall = Integer.parseInt(tallLest);
            sum += tall;
            if (tallLest != null){
                dele++;
            }
            tallLest = showInputDialog("Skriv et tall, eller avslutt med ESC.");
        }
        System.out.println(dele);
        showMessageDialog(null,"Summen av tallene er " + sum );
        showMessageDialog(null, "Gjennomsnittet av tallene er %d".formatted(new Object[]{sum / dele}));
    }
}
