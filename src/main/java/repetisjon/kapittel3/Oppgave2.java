/**
 * 3.12 valg som kontroll strukturer
 * oppgave 3.12
 * oppgave2
 * test om et tall et negativt eller positivt
 * om tallet befinner seg innenfor et gitt intervall
 * om det er delelig med et gitt tall
 */

package repetisjon.kapittel3;

import java.util.Random;
import java.util.Scanner;

public class Oppgave2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random(1);
        System.out.println("Tast inn et heltall tall som skal brukes til å dele med, NB ikke null : ");
        System.out.println();
        int dele = scanner.nextInt();
        System.out.println("Tast inn det første tallet i tallintervallet ");
        System.out.println();
        int tallIntervallA = scanner.nextInt();
        System.out.println("Tast inn det andre tallet i tallintervallet ");
        int tallIntervallB = scanner.nextInt();
        System.out.println();
        scanner.close();

        int tall = random.nextInt(100);

        System.out.println("                    ***   FAKTA   ***   ");
        System.out.println(" Delingstall = " + dele + ", Tallintervallet er [" + tallIntervallA + " - " + tallIntervallB + "] og det tilfeldige tallet er " + tall);

        String positivitet = (tall > 0) ? " Taller er positivt" : " Tallet er 0 eller negativt";
        System.out.println(positivitet);

        double delt = tall % dele;
        if (delt == 0){
            System.out.println(" Tallet er delelig med delingstallet");
        } else {
            System.out.println(" Tallet er ikke deleleling med delingstallet da det kommer rest");
        }

        String mengdeStatus = (tall >= tallIntervallA) && (tall <= tallIntervallB) ? " Tallet befinner seg innenfor den gitte tallmengden.": " Tallet befinner seg IKKE innenfor den gitte tallmengden.";
        System.out.println(mengdeStatus);
    }
}
