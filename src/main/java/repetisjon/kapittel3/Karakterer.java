/**
 * Kapittel 3.5 Nøstet if og flervalg
 * oppgave 3.5
 */

package repetisjon.kapittel3;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import static javax.swing.JOptionPane.*;

public class Karakterer {

    final int MAX = 100;

    public static void main(String[] args){

        Karakterer karakterer = new Karakterer();

        String poengLest = showInputDialog(null, " Tast inn antall poeng");
        int poeng = Integer.parseInt(poengLest);

        if (poeng > 100){
            showMessageDialog(null,(" Poengsummen kan ikke overskride:  " + karakterer.MAX + " karakterpoeng" ), "ADVARSEL", WARNING_MESSAGE );
        }
        else if (poeng >= 96){
            showMessageDialog(null," Karakteren er A --> (Bestått) ", "KARATTER", PLAIN_MESSAGE );
        }
        else if (poeng >= 86){
            showMessageDialog(null," Karakteren er B --> (Bestått) ", "KARATTER", PLAIN_MESSAGE );
        }
        else if (poeng >= 71){
            showMessageDialog(null," Karakteren er C --> (Bestått) ", "KARATTER", PLAIN_MESSAGE );
        }
        else if (poeng >= 55){
            showMessageDialog(null," Karakteren er D --> (Bestått) ", "KARATTER", PLAIN_MESSAGE );
        }
        else if (poeng >= 36 ){
            showMessageDialog(null," Karakteren er E --> (Bestått) ", "KARATTER", PLAIN_MESSAGE );
        }
        else if (poeng >= 0){
            showMessageDialog(null," Karakteren er F --> (Stryk) ", "KARATTER", PLAIN_MESSAGE);
        }
        else {
            showMessageDialog(null, " Poengene kan ikke være negative ", "ADVARSEL", WARNING_MESSAGE);
        }

        karakterer.omvendt();

    }
    public void omvendt(){
        String message;
        String poengLest = showInputDialog(null, " Tast inn antall karakterpoeng");
        int poeng = Integer.parseInt(poengLest);


        if (poeng < 0){
            message = " Poengene kan ikke være negative ";
        }
        else if (poeng <= 36 && poeng > 0){
            message = " Karakteren er F --> (Stryk) ";
        }
        else if (poeng <= 55 && poeng > 36){
            message = " Karakteren er E --> (Bestått) ";
        }
        else if (poeng <= 71 && poeng > 55){
            message = " Karakteren er D --> (Bestått) ";
        }
        else if (poeng <= 86 && poeng > 71){
            message = " Karakteren er C --> (Bestått) ";
        }
        else if (poeng <= 96 && poeng > 86){
            message = " Karakteren er B --> (Bestått) ";
        }
        else if (poeng <= 100){
            message = " Karakteren er A --> (Bestått) ";
        }
        else {
            message = " Poengene kan ikke overskride " +MAX;
        }
        showMessageDialog(null,message, "KARAKTERER",PLAIN_MESSAGE);
    }
}
