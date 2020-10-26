/*
Kapittel 4.14
oppgave 4 Revidert utgave
Lag et program som som regner ut hovedkarakteren fra en rekke karakterer mellom A - E
revidet :  Lag et program som som regner ut veiet snittkarakter fra en rekke karakterer mellom A - E
Spør brukeren om Øvre og nedre verdi leses inn fra bruker
Den reviderte utgaven skal beregne veiet snitt, antall studiepoeng for hver karakter multipliseres med anttal karakterer og
sluttsummen av alle studiepoeng divideres med antall studiepoeng.
*/

package repetisjon.kapittel4;

import java.util.Scanner;

public class Opp4_14_2_4_Revidert {

    private final Scanner scanner = new Scanner(System.in);
    private int sum = 0;
    private int antall;
    private int totalAntall;
    private int sumVeietKarakter;
    private int sumVeietSnitt;

    public static void main(String[] args) {
        Opp4_14_2_4_Revidert hkarakter = new Opp4_14_2_4_Revidert();
        hkarakter.lesInnVerdier();
        hkarakter.scanner.close();
        hkarakter.skrivUtResultat();
    }
    public void lesInnVerdier() {
        System.out.println(" Tast inn antall karakterer som skal beregnes NB minst 10 karakterer  ");
        antall = scanner.nextInt();
        totalAntall =antall;

        for (int i = 1; i <= antall; i++) {
            System.out.println(" Tast inn Karakteren i store bokstaver ( A-E ) :  ");
            String karakter = scanner.next();
            int tallet = karakter.charAt(0);
            if ((tallet >= 65) && (tallet <= 69 )) {
                sumVeietKarakter = tallet * totalAntall;
                sumVeietSnitt += sumVeietKarakter;
                sumVeietKarakter =0;
                sum += tallet;
                // System.out.println("Sum " + sum); // DENNE ER KUN FOR MIN KONTROLL
            }
            else {
                System.out.println(" Du skrev feil karakter kun Karakteren i store bokstaver ( A-E ) prøv på nytt : ");
                i--;
            }
        }
    }

    public void skrivUtResultat() {
        int resultat;
        char hovedkarakter;

        double beregn = sum % antall;
        if ( beregn >=0.5){
            beregn -= 0.5; // LAVERE POENGSUM GIR HØYERE KARAKTERER OG RUNDER AV TIL HØYERE KARAKTER HER
            resultat = (int) ((sum / antall) + beregn);
            hovedkarakter = (char) resultat;
            System.out.println(" Poengsummen er   :" + resultat);
            System.out.println(" Hovedkarakteren er " + hovedkarakter);
            System.out.println(" Veiet snitt for studiepoengene: " + ( sumVeietSnitt /totalAntall));
        }  else if (beregn < 0.5) {   // det vil ikke være behov for denne
           resultat = (int) (sum / antall);
           hovedkarakter = (char) resultat;
           System.out.println(" Poengsummen er :" + resultat);
           System.out.println(" Hovedkarakteren er " + hovedkarakter);
           System.out.println(" Veiet snitt for studiepoengene: " + ( sumVeietSnitt /totalAntall));
       }
    }
}


