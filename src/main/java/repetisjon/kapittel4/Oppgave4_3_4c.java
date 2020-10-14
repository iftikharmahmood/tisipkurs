/**
 * 4 Løkke som kontroll strukturer
 * oppgave 4.3
 * oppgave 4 C
 * While løkke bruk
 * Registreringer i Mai måned
 */

package repetisjon.kapittel4;

import java.util.Scanner;

public class Oppgave4_3_4c {

    public static void main(String[] args) {

        System.out.println(" Tast inn hvilke dager du har sykklet til jobben");
        System.out.println("Hvis du sykklet en dag svarer du med 1 på den dagen, hvis du ikke sykklet den dagen svarer du med 0");
        Scanner scanner= new Scanner(System.in);
        int syklet = 0;
        final int ANTALL_DAGER_I_MAI = 31;
        int teller = 1;
        while (teller <= ANTALL_DAGER_I_MAI){
            System.out.println(" Sykklet du " + teller + " Mai ? ");
            syklet = syklet + scanner.nextInt();
            teller++;
        }
        System.out.println(" Du sykklet " + syklet + " dager til jobben");
    }
}
