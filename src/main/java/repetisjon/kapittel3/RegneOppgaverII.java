/**
 * Kapittel 3.7 logiske uttrykk
 * Oppgave 2 a - g
 */
package repetisjon.kapittel3;

import static javax.swing.JOptionPane.*;
import java.util.Random;

public class RegneOppgaverII {

    public static void main(String[] args) {

        //a
        Random random = new Random();
        int elever = random.nextInt(100);
        boolean antallElever = (elever > 20) && (elever < 30);
        if (antallElever){
            System.out.println(" At antall elever er mindre en 30 og større en 20 er sann, tallet er: " + elever);
        } else {
            System.out.println(" At antall elever er mindre en 30 og større en 20 er usann, tallet er: " + elever);
        }

        //b
        int lotto1;
        int lotto2;
        int lotto3;
        lotto1 = random.nextInt(24) +1;
        lotto2 = random.nextInt(24) +1;
        lotto3 = random.nextInt(24) +1;
         boolean gevinst;
        if ( (lotto1 == 13) || (lotto2 == 18) || (lotto3 == 25)){
            gevinst = true;
            System.out.println(" Gevinst tallene er : Tall1: 13, Tall2: 18, Tall3: 25 ");
            System.out.println();
            System.out.println(" Lotto vunnet, gevinst er sann:  " + gevinst);
            System.out.println("Dine tall er: Tall1: "+ lotto1 +", Tall2: " + lotto2 + ", Tall3: " + lotto3);
        } else {
            gevinst = false;
            System.out.println(" Gevinst tallene er : Tall1: 13, Tall2: 18, Tall3: 25 ");
            System.out.println();
            System.out.println(" Ingen lotto, gevinst er usann: " + gevinst);
            System.out.println("Dine tall er: Tall1: "+ lotto1 +", Tall2: " + lotto2 + ", Tall3: " + lotto3);
        }

        //c
        System.out.println();
        String svar = showInputDialog(" Tast inn ditt svar enten j/J for ja eller n/N for nei: ");
        if (svar.charAt(0) == 'j' || svar.charAt(0) == 'J'){
            showMessageDialog(null, "svare er j/J (ja), utrykket er sann ");
        } else {
            showMessageDialog(null, "svare er ikke ja, men forskjellig fra j/J, uttrykket er usann ");
        }

        //d
        int temperatur = random.nextInt(24)+1;
        if (temperatur > 15 && temperatur < 25){
            System.out.println("Temperatuten er innen for  det lukkede intervallet [15 - 25] " + temperatur);
        } else {
            System.out.println("Temperatuten er IKKE innen for det lukkede intervallet [15 - 25], DVS divergerer " + temperatur);
        }

        //e
        int sum = random.nextInt();
        if (sum >= 10 && sum <= 100){
            System.out.println("Summen er innenfor det åpne intervallet <10 - 100> " + sum);
        } else {
            System.out.println("Summen er Utenfor det åpne intervallet <10 - 100> " + sum);
        }

        //f
        String tegn = showInputDialog(" Tast inn en tilfeldig bokstav mellom a/A - å/Å. ! Kun en bokstav");
        if ((tegn.charAt(0) >= 'a' && tegn.charAt(0) <= 'å') || (tegn.charAt(0) >= 'A' && tegn.charAt(0) <= 'Å')){
            System.out.println("Tegnet er innenfor intervallet (a/A - å/Å) " + tegn);
        } else {
            System.out.println("Tegnet er Utenfor intervallet (a/A - å/Å) " + tegn);
        }

        //g
        int siffer = random.nextInt(9);
        if (siffer >= 0 && siffer <= 9){
            System.out.println("Sifferet er innenfor intervallet (0 - 9) " + siffer);
        } else {
            System.out.println("Sifferet er Utenfor intervallet (0 - 9) " + siffer);
        }
    }

}
