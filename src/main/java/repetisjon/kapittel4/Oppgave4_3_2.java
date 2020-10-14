/**
 * 4 Løkke som kontroll strukturer
 * oppgave 4.3
 * oppgave 2
 * While løkke bruk
 * Finn logiske feil
 */
package repetisjon.kapittel4;

import java.util.Scanner;

public class Oppgave4_3_2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Skriv inn grunntallet: ");
        double grunnTall = scanner.nextDouble();

        System.out.println(" Skriv inn eksponenten");
        int eksponent = scanner.nextInt();

        double svar = 0;
        int teller = 1;
        int i = 0;
        while (teller < eksponent){
            i++;
            svar += grunnTall * eksponent;
            System.out.println(" runde nr " +i);
            eksponent--; // eksponent++;
        }
        System.out.println(" Svaret er : " +svar);
        System.out.println("Antall runder : " +i);
    }
}
/*
* Testdata
* 15 | 2  --> Svaret er : 3.4587645123155714E19
* 12,7 | 10  -->  Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
	at repetisjon.kapittel4.Oppgave4_3_2.main(Oppgave4_3_2.java:18)
	*
* 100 | 100  -->  Svaret er : 2.3058430080975346E20
* 2,5 | 3  -->  Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextDouble(Scanner.java:2564)
	at repetisjon.kapittel4.Oppgave4_3_2.main(Oppgave4_3_2.java:18)
	*
* 2 | 2 -->  Svaret er : 4.6116860142666486E18 ( Antall runder : 2147483646 )
 */