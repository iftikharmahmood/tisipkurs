/**
 * 3.12 valg som kontroll strukturer
 * oppgave 3.12
 * oppgave 3
 * Finn ut om et årstall er skuddår
 */
package repetisjon.kapittel3;

import java.util.Scanner;

public class Skuddaar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Tast inn et årstall, fire siffer");
            String tallLest = scanner.next();
            int tall1 = Integer.parseInt(String.valueOf(tallLest.charAt(2)));
            int tall2 = Integer.parseInt(String.valueOf(tallLest.charAt(3)));
            //double aar = tall1
            String message = (((((tall1 * 10) + tall2) % 4) > 0)) ? " Dette året er et skuddår " : " Detter året er IKKE et skuddår";
            System.out.println();
            System.out.println(message);
            System.out.println();
            System.out.println("Tast n for å avslutte, tast en hvilken som helst annen tast for å fortsette");
    }
}