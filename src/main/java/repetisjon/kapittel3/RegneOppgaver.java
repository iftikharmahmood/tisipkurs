/**
 * Kapittel 3.7 logiske uttrykk
 * Oppgave 1
 */
package repetisjon.kapittel3;

public class RegneOppgaver {

    public static void main(String[] args) {

        //a
        boolean a = (5*3)/(4+3)<10;
        if (a){
            System.out.println(" Utrykke i oppgave a er sann:  " + a);
        } else {
            System.out.println(" Utrykket i oppgave a er usann: " + a);
        }

        //b
        boolean b = !(4>3);
        if (b){
            System.out.println(" Utrykke i oppgave b er sann:  " + b);
        } else {
            System.out.println(" Utrykket i oppgave b er usann:  " + b);
        }
        //c
        boolean c = (2 < 20) && (4.5 > 20);
        if (c){
            System.out.println(" Utrykke i oppgave c er sann:   " + c);
        } else {
            System.out.println(" Utrykket i oppgave c er usann:  " + c);
        }

        //d
        boolean d = (2<20) || (4.5 > 20);
        if (d){
            System.out.println(" Utrykke i oppgave c er sann:  " + d);
        } else {
            System.out.println(" Utrykket i oppgave c er usann:  " + d);
        }

    }
}
