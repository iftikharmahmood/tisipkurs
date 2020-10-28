package repetisjon.kapittel5;
import static javax.swing.JOptionPane.*;

public class Oppg5_3_1 {

    public static void main(String[] args) {
        String kode = showInputDialog("Fagkode: ");
        String antStudLest = showInputDialog("Antall studenter: ");
        int antStud = Integer.parseInt(antStudLest);
        Fag fag1 = new Fag(kode, antStud);


        //oppgave 3
        Fag fag2 = fag1;
        fag1.setAntStud(fag1.getAntStud()+5);
        fag2.setAntStud(fag2.getAntStud()+5);

        showMessageDialog(null, "Du skrev fagkode: " + fag1.getFagkode() + " og ant.stud = " + fag1.getAntStud());

        //oppgave 2
        //Fag fag2 = fag1;
        showMessageDialog(null, "Du skrev fagkode: " + fag2.getFagkode() + " og ant.stud = " + fag2.getAntStud());

        //oppgave 4
        final Fag fag3 = new Fag("LO191D", 40);
        fag3.setAntStud(3);
        showMessageDialog(null, "Du skrev fagkode: " + fag3.getFagkode() + " og ant.stud = " + fag3.getAntStud());

        //oppgave 5
        final Fag fag4 = new Fag(null, null);
        showMessageDialog(null, " Du skrev fagkode: " + fag4.getFagkode() + " og ant.stud = " + fag4.getAntStud());


    }
}
