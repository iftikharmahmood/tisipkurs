/**
 * Britiske pund	GBP	12,3294	12,0991
 *Euro	EUR	11,1495	10,9693
 *Filippinske peso	PHP	19,669	19,343
 * Hong Kong dollar	HKD	1,2288	1,2069
 *Islandske kroner	ISK	6,76	6,66
 * Malaysiske ringgit	MYR	2,2919	2,2509
 * Pakistanske rupi	PKR	5,948	5,831
 * Polske zloty	PLN	2,412	2,3742
 *
 *
 */

package repetisjon.kapittel5;

import java.util.Scanner;

public class Valuta {
    private final double GBP = 12.3294;
    private final double EUR = 11.1495;
    private final double PHP = 19.669;
    private final double HKD = 1.2288;
    private final double MYR = 2.2919;
    private final double PKR = 0.5948;
    private final double PLN = 2.412;
    private final Scanner scanner = new Scanner(System.in);

    public double getGBP() {
        return GBP;
    }

    public double getEUR() {
        return EUR;
    }

    public double getPHP() {
        return PHP;
    }

    public double getHKD() {
        return HKD;
    }

    public double getMYR() {
        return MYR;
    }

    public double getPKR() {
        return PKR;
    }

    public double getPLN() {
        return PLN;
    }

    public void selectorLocal(String choise, double beløp) {

        switch (choise) {
            case "GBP":
                System.out.println(beløp + ", Britiske Pund i Norske kroner blir  " + beløp * GBP + ", NOK ");
                break;
            case "EUR":
                System.out.println(beløp + ", Europeiske Euro i Norske kroner blir " + beløp * EUR + ", NOK ");
                break;
            case "PHP":
                System.out.println(beløp + ", Filipinske Pesos i Norske kroner blir " + beløp * PHP + ", NOK ");
                break;
            case "HKD":
                System.out.println(beløp + ", Hong Kong Dollar i Norske koner blir " + beløp * HKD + ", NOK ");
                break;
            case "MYR":
                System.out.println(beløp + ", Malaysiske Ringit i Norske kroner blir " + beløp * MYR + ", NOK ");
                break;
            case "PKR":
                System.out.println(beløp + ", Pakistanske Rupis i Norske kroner blir " + beløp * PKR + ", NOK ");
                break;
            case "PLN":
                System.out.println(beløp + ", polske Zloti i Norske kroner blir " + String.format(String.valueOf(beløp * PLN)) + ", NOK ");
                break;
            default:
                System.out.println(" ---= Du oppga feil valuta kode =--- \n" + " Gydige koder er : GBP, EUR, PHP, HKD, MYR, PKR, PLN");
        }
    }


    public void selectorUtenlandsk(String choise, double beløp) {

        switch (choise) {
            case "GBP":
                System.out.println(beløp + ", Norske kroner blir " + beløp / GBP + ", i Britiske Pund ");
                break;
            case "EUR":
                System.out.println(beløp + ", Norske kroner blir " + beløp / EUR + ", i Europeiske Euro ");
                break;
            case "PHP":
                System.out.println(beløp + ", Norske kroner blir " + beløp / PHP + ", i Filipinske Pesos ");
                break;
            case "HKD":
                System.out.println(beløp + ", Norske koner blir " + beløp / HKD + ", i Hong Kong Dollar ");
                break;
            case "MYR":
                System.out.println(beløp + ", Norske kroner blir " + beløp / MYR + ", i Malaysiske Ringit ");
                break;
            case "PKR":
                System.out.println(beløp + ", Norske kroner blir " + beløp / PKR + ", i Pakistanske Rupis ");
                break;
            case "PLN":
                System.out.println(beløp + ", Norske kroner blir  "+ String.format(String.valueOf(beløp / PLN)) + ", i Polske Zloti ");
                break;
            default:
                System.out.println(" ---= Du oppga feil valuta kode =--- \n" + " Gydige koder er : GBP, EUR, PHP, HKD, MYR, PKR, PLN");
        }
    }


    public void menueTilNorsk() {
        String choise;
        double beløp;

        System.out.println("********** Valuta kode og kurs mot Norsk krone NOK **********");
        System.out.println("Britiske    pund    kode; GBP, kurs: 12,3294\n");
        System.out.println("Europeiske  Euro    kode: EUR, kurs: 11,1495\n");
        System.out.println("Filipinske  pesos   kode: PHP, kurs: 19,669 \n");
        System.out.println("Hong Kong   dollar  kode: HKD, kurs: 1,2288\n");
        System.out.println("Islandske   kroner  kode: ISK, kurs: 6,76\n");
        System.out.println("Malaysiske  ringit kode: MYR, kurs: 2,2919\n");
        System.out.println("Pakistanske rupi    kode: PKR, kurs: 5,948\n");
        System.out.println("Polske      zloty   kode: PLN, kurs: 2,412\n");
        System.out.println("***********************************************************");

        System.out.println("Tast inn koden til den valutta du vil konvertere til norske kroner: ");
        choise = scanner.next();
        choise = choise.toUpperCase();

        System.out.println("Tast inn beløpet i " + choise + ", valutta du vil konvertere til i norske kroner: ");
        beløp = scanner.nextDouble();
        selectorLocal(choise, beløp);
    }

    public void menueTilUtenlandsk() {
        String choise;
        double beløp;

        System.out.println("********** Valuta kode og kurs mot Norsk krone NOK **********");
        System.out.println("Britiske    pund    kode; GBP, kurs: 12,3294\n");
        System.out.println("Europeiske  Euro    kode: EUR, kurs: 11,1495\n");
        System.out.println("Filipinske  pesos   kode: PHP, kurs: 19,669 \n");
        System.out.println("Hong Kong   dollar  kode: HKD, kurs: 1,2288\n");
        System.out.println("Islandske   kroner  kode: ISK, kurs: 6,76\n");
        System.out.println("Malaysiske  ringit kode: MYR, kurs: 2,2919\n");
        System.out.println("Pakistanske rupi    kode: PKR, kurs: 5,948\n");
        System.out.println("Polske      zloty   kode: PLN, kurs: 2,412\n");
        System.out.println("***********************************************************");

        System.out.println("Hvilken valuta vil du konvertere Norske kroner til, tast inn valuta kode: ");
        choise = scanner.next();
        choise = choise.toUpperCase();

        System.out.println("Tast inn beløpet i Norsk valutta du vil konvertere til i" + choise + ", valuta: ");
        beløp = scanner.nextDouble();
        selectorUtenlandsk(choise, beløp);
    }

    public void dirigent(){
        System.out.println(" ----------------------------=   VALUTTA KALKULATOR   =----------------------------\n");
        System.out.println(" For å konvertere fra Norske kroner til utenlandsk valutta tast 1\n");
        System.out.println(" For å konvertere utenlandsk valutta til Norke kroner tast 2\n" );
        System.out.println(" Tast et hvilket som helst annet tall for å avslutte,\n (alt annet enn et heltall vil resultere i feilmelding\n" );
        System.out.println(" Ditt valg: ");

        int konverter =scanner.nextInt();

        while (konverter >0 && konverter <3){
            if (konverter == 1){
                menueTilNorsk();

            } else {
                menueTilUtenlandsk();
            }

            System.out.println(" For å konvertere fra Norske kroner til utenlandsk valutta tast 1\n");
            System.out.println(" For å konvertere utenlandsk valutta til Norke kroner tast 2\n" );
            System.out.println(" Tast et hvilket som helst annet tall for å avslutte,\n (alt annet enn et heltall vil resultere i feilmelding\n" );
            System.out.println(" Ditt valg: ");
            konverter =scanner.nextInt();

        }

    }
}







