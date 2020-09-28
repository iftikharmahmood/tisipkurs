package repetisjon.kapittel2;
import static javax.swing.JOptionPane.*;
import java.util.*;

public class Formatering {

    public static void main(String[] args){
        String tallLest= showInputDialog("Skriv et tall");
        double tall = Double.parseDouble(tallLest);

        System.out.print(" Tallet var ");
        System.out.printf("%.2f",tall);
        System.out.println(" med 2 desimaler");

        Formatter formatter = new Formatter();
        formatter.format("%.2f",tall);
        String tekst = " Tallet var " + formatter.toString()
                + " med 2 desimaler.";
        showMessageDialog(null, tekst);
    }
}
