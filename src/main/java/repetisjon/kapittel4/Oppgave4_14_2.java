/**
 * Kapittel 4.14
 * oppgave 2
 * Lag et program som tegner en rettvinklet trekant
 * Spør brukeren om antall linjer
 */
package repetisjon.kapittel4;

import java.util.Scanner;

public class Oppgave4_14_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Tast inn antall linjer figuren skal ha");
        int linje = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <=  linje; i++){

            for (int j = 0; j <=  i; j++ ){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
