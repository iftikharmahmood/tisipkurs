/*
 * Kapittel 2.6 oppgave
 */
package repetisjon.kapittel2;
import java.util.Scanner;
import static javax.swing.JOptionPane.*;

public class Arealberegning2a {

    public static void  main(String[] args){

        double lengde = 24.5;
        double bredde = 20.3;
        double arealet = lengde * bredde;
        double omkrets = (2 * lengde) + (2 * bredde);
        System.out.println(" Arealet av rektangelet er "+ arealet +" kvadratmeter");
        System.out.println("Og omkretsen av rektangelen er " + omkrets + " meter");

        showMessageDialog(null,"Nå skal du taste inn verdiene til rektagelen selv","Melding fra programmet", WARNING_MESSAGE);
        String lengdeLest = showInputDialog(null,"Tast inn lende på rektangelen i meter: ", "TAST INN VERDIER",QUESTION_MESSAGE);
        double lengthIn= Double.parseDouble(lengdeLest);
        showMessageDialog(null,"Neste verdi skal tastet inn på commando promptet, (treminalvinduet) dette kun for tull","Melding fra programmet", WARNING_MESSAGE);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Tast inn den nye bredden på rektangelen. NB denne verdien må tastes inn med KOMMA og ikke PUNGTUM ");
        double breddeLest = scanner.nextDouble();


        arealet = lengthIn * breddeLest;
        omkrets = (2 * lengthIn) + (2 * breddeLest);
        scanner.close();

        showMessageDialog(null," Arealet av rektangelet er nå "+ arealet +" kvadratmeter", " Resultat", INFORMATION_MESSAGE);
        showMessageDialog(null,"Og omkretsen av rektangelen er " + omkrets + " meter", " Resultat", INFORMATION_MESSAGE);
        System.out.println(" Arealet av rektangelet er nå "+ arealet +" kvadratmeter");
        System.out.println("Og omkretsen av rektangelen er " + omkrets + " meter");


    }
}
