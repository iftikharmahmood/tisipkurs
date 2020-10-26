/*
Kapittel 4.14
oppgave 5 Primtall
Lag et program som finner ut om et tall er primtall
Spør brukeren om tallene som skal beregnes
*/
package repetisjon.kapittel4;

import java.util.Scanner;

public class Opp4_14_5 {

    public static void main(String[] args) {

        int antall;
        double tallet;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Tast in antall ganger programmet skal kjøres  ");
        antall = scanner.nextInt();

        for (; antall > 0; antall--) {
            System.out.println("Tast inn et heltall mellom 2 og 200");
            tallet = scanner.nextDouble();
            if (tallet % 2 > 0) {
                System.out.println(tallet + " er IKKE et primtall");

            } else {
                System.out.println(tallet + " er et primtall");
            }
        }
    }
}
