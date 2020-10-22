/**
 * Kapittel 4.14
 * oppgave 3
 * Lag et program som tegner en likesidet trekant
 * Spør brukeren om antall linjer
 */
package repetisjon.kapittel4;

import java.util.Scanner;

public class Oppgave4_14_3 {

    private int linje;
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Oppgave4_14_3 rettVinklet = new Oppgave4_14_3();

        rettVinklet.lesLinjer();
        rettVinklet.rettVinklet();
        rettVinklet.lesLinjer();
        rettVinklet.omvendtRettVinklet();
        rettVinklet.lesLinjer();
        rettVinklet.likeSidetTrekant();
        rettVinklet.lesLinjer();
        rettVinklet.rutter();
        rettVinklet.scanner.close();


    }

    public int lesLinjer() {
        System.out.println(" Tast inn antall linjer figuren skal ha");
        linje = scanner.nextInt();
        return linje;
    }

    public void rettVinklet() {

        for (int i = 0; i <= linje; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void omvendtRettVinklet() {

        for (; linje > 0; linje--) {

            for (int j = linje; j > 0; j--) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void likeSidetTrekant() {

        for (int i = 0; i <= linje; i++) {

            for (int x = 0; x <= linje - i; x++) {
                System.out.print(" ");
            }
            for (int y = 0; y <= i; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public void rutter(){

        for (int i = 0; i <= linje; i++) {

            for (int x = 0; x <= linje - i; x++) {
                System.out.print(" ");
            }
            for (int y = 0; y <= i; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = linje; i > 0; i--){

            for (int x = 0; x <= linje -i; x++){
                System.out.print(" ");
            }

            for (int j = 0; j < i ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}