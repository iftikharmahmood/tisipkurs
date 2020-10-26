/*
Kapittel 4.14
oppgave 6
Lag et program som omformer 10 tallsystemet og et annet tallsystem
omform grunntallene fra 2 - 9
*/
package repetisjon.kapittel4;

import java.util.Scanner;

public class Opp4_14_6 {

    private int tallLest;
    private int grunntall = 1;
    private int count;
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Opp4_14_6 converter = new Opp4_14_6();
        converter.read();
        converter.binaryDigits();
        converter.octaSys();
        converter.hvilketSomhelstTallsystem();
    }

    private void read() {
        System.out.println("Tast inn et positivt heltall som skal konverteres til BINÆR, 8 tall system og et hvilket som helst tallsystem tall");
        tallLest= scanner.nextInt();
        System.out.println(" Tast inn grunntallet for tallsystemet du vil konvertere til NB et tall mellom 2 og 9");
        grunntall = scanner.nextInt();
        scanner.close();
    }

    public int getTallLest() {
        return tallLest;
    }

    public void setTallLest(int tallLest) {
        this.tallLest = tallLest;
    }

    public int getGrunntall() {
        return grunntall;
    }

    public void setGrunntall(int grunntall) {
        this.grunntall = grunntall;
    }

    private void binaryDigits() {
        String digitStream="";
        int lengde;
        int binary = tallLest;
        char copyLastDigit;
        String copy2="";
        String result= "";
        System.out.println(" Tallet konvertert til det binære tallsystem");
        while (binary > 0){
            int digit = binary % 2;
            digitStream += String.valueOf(digit);
            binary /= 2;
        }
        lengde = digitStream.length();
        copyLastDigit = digitStream.charAt(lengde-1);
        for (int i = 0; i < lengde-1; i++) {
            result += String.copyValueOf(new char[]{digitStream.charAt(i)});
        }
        System.out.println(copyLastDigit + result);
        System.out.println();
    }
    private void octaSys() {
        System.out.println(" Tallet konvertert til 8-tallsystem");
        int desimalTall = tallLest;
        String octett = "";
        while (desimalTall > 0){
            octett = desimalTall % 8 + octett;
            desimalTall /= 8;
        }
        System.out.println(octett);
    }

   private void hvilketSomhelstTallsystem(){
        int tallet = tallLest;
        String konverter = "";
        if (grunntall > 2 || grunntall < 9){
            while (tallet > 0){
                konverter = tallet % grunntall + konverter;
                //konverter += String.valueOf(tallLest % grunntall);
                tallet /= grunntall;
            }
        }

       System.out.println(" Tallet " + getTallLest() + " konvertert til tallsystemet " + getGrunntall() +" blir :  " + konverter);
   }
}
// Jeg måtte ta i bruk fasiten for å få på plass denne