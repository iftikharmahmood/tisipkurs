/**
 * 3.12 valg som kontroll strukturer
 * oppgave 3.12
 * oppgave1
 * La bruker taste inn sitt fødselsnr og ut i fra det
 * fortell hvilket likningskontor vedkommende skal benytte
 */
package repetisjon.kapittel3;

import java.util.Scanner;

public class Likningskontoret {

    public static void main(String[] args) {

        System.out.println("OPPGI DAG I MÅNEDEN DU ER FØDT  tall memlom 1 og 31");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tast inn her: ");
        int fDato = scanner.nextInt();
        scanner.close();

        if (fDato <= 8){
            System.out.println(" ***   DU SOGNER TIL LIKNINGSKONTOR NR. 113   ***");
        } else if (fDato <= 14){
            System.out.println(" ***   DU SOGNER TIL LIKNINGSKONTOR NR. 120   ***");

        } else if (fDato <= 25) {
            System.out.println(" ***   DU SOGNER TIL LIKNINGSKONTOR NR. 125   ***");

        } else if (fDato <= 31) {
            System.out.println(" ***   DU SOGNER TIL LIKNINGSKONTOR NR. 134   ***");
        }
        else {
            System.out.println(" ***   DU TASTET FEIL FØDSELS NR   ***");
        }

    }
}
