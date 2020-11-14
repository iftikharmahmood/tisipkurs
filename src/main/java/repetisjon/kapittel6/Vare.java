/**
 * Prisberegning.java  - "Programmering i Java", 4.utgave - 2009-07-01
 * Vare: Klassen beskriver varer med navn, nummer og pris.
 * Programmet brukes i øvingsoppgaver i kapittel 6.
 *
 *
 */

package repetisjon.kapittel6;

import java.util.Locale;
import java.util.Scanner;
import java.util.Formatter;

class Vare {
    public static final double MOMS = 0.24;
    //public static final double MOMSFAKTOR = 1.0 + MOMS / 100.0;
    public static final Scanner scanner = new Scanner(System.in);
    private final String VARENAVN;
    private final int VARENR;

    private double pris; // pris pr. kilo, alltid uten moms
    private double kvantum;

    public Vare(String varenavn, int varenr, double pris, double kvantum) {
        this.VARENAVN = varenavn;
        this.VARENR = varenr;
        this.pris = pris;
        this.kvantum = kvantum;
    }
    public Vare(String varenavn, int varenr, double pris) {
        this.VARENAVN = varenavn;
        this.VARENR = varenr;
        this.pris = pris;
    }

    public Vare(String varenavn, int varenr) {
        this.VARENAVN = varenavn;
        this.VARENR = varenr;
        this.pris = 0.0;
    }

    public String getVARENAVN() {
        return VARENAVN;
    }

    public int getVARENR() {
        return VARENR;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public void lesPris(){
        System.out.println(" Tast inn prisen pr kilo i kroner for vare: " + VARENAVN + ", :  ");
        setPris(scanner.nextDouble());
        System.out.println(" Prisen for " + VARENAVN + ", er satt til : " + pris + ", kroner pr kilo");
        System.out.println();
    }

    public void lesKvantum(){
        System.out.println(" Tast inn antall kilo for vare: " + VARENAVN + ", :  ");
        setKvantum(scanner.nextDouble());
        System.out.println(" Kvantum for " + VARENAVN + ", er satt til : " + kvantum + ", kilo kjøpt vare");
        System.out.println();
    }
    public void setKvantum(double kvantum){
        this.kvantum = kvantum;
    }
    public double getKvantum() {
        return kvantum;
    }

    public String beregnPris(){
        Formatter f = new Formatter();
        double prisen;
        double mva;
        double rabatt;
        String resultat ="";

        if (kvantum < 5 && kvantum >= 3){
            prisen = pris * kvantum;
            rabatt = prisen * 0.1;
            prisen = prisen - rabatt;
            mva =  prisen * MOMS;
            f.format("%2f", pris);
            f.format("%2f", prisen);
            f.format("%2f", kvantum);
            f.format("%2f", rabatt);
            f.format("%2f", mva);
            f.format("%2f", MOMS);

           resultat = ("For " + kvantum + ", kilo Norgesost blir den rabbaterte prisen: "
                    + prisen + ", kroner uten merverdiavgift. \n"
                    + " Merverdiavgiften blir:  " + mva + ", kroner. \n"
                    + " Den totale prisen på varen blir : " + (prisen + mva ) + "\n"
                    + " 10% rabatt for kjøp fra 3 kg inntil 5 kg tilsvarer " + rabatt
                    + ", kroner som er trukket fra sluttsummen \n");


        } else  if (kvantum >= 5){
            prisen = pris * kvantum;
            rabatt = prisen * 0.2;
            prisen = prisen - rabatt;
            mva =  prisen * MOMS;
            f.format("%2f", pris);
            f.format("%2f", prisen);
            f.format("%2f", kvantum);
            f.format("%2f", rabatt);
            f.format("%2f", mva);
            f.format("%2f", MOMS);

            resultat = ("For " + kvantum + ", kilo Norgesost blir den rabbaterte prisen: "
                    + prisen + ", kroner uten merverdiavgift. \n"
                    + " Merverdiavgiften blir:  " + mva + ", kroner. \n"
                    + " Den totale prisen på varen blir : " + (prisen + mva) + "\n"
                    + " 20% rabatt for kjøp fra 5 kg og oppover, tilsvarer " + (rabatt)
                    + ", kroner som er trukket fra sluttsummen \n");
        } else if (kvantum < 3){
            prisen = pris * kvantum;
            mva =  prisen * MOMS;
            f.format("%2f", pris);
            f.format("%2f", prisen);
            f.format("%2f", kvantum);
            f.format("%2f", mva);
            f.format("%2f", MOMS);

            resultat = ("For " + kvantum + ", kilo Norgesost blir prisen: "
                    + prisen + ", kroner uten merverdiavgift. \n"
                    + " Merverdiavgiften blir:  " + mva + ", kroner og \n"
                    + " Den totale prisen på varen blir : " + (prisen + mva) + "\n"
                    + " Det er ingen rabatt da kvantum kjøpt er under 3 kilo \n");
        }
        return resultat;
    }

    public String toString() {
        Formatter f = new Formatter();
        f.format("%.2f", pris);
             return "Vare nr. : " + VARENR + ", Varenavn : " + VARENAVN + ", pris pr. kg kr " + f.toString() + " u.moms.";
    }


}
