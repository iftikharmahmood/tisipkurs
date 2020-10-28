package repetisjon.kapittel5;

public class Opp5_4_1 {
    public static void main(String[] args) {


        Fag fag1 = new Fag();
        System.out.println(" Standardverdi for fagkode " +fag1.getFagkode() + ".");
        System.out.println(" Standardverdi for antall studenter " + fag1.getAntStud() + ".");
        fag1.setFagkode("LO172D");
        fag1.setAntStud(47);
        Fag fag2 = new Fag("LC238D");
        fag2.setAntStud(40);
        int sum = fag1.getAntStud() + fag2.getAntStud();
        System.out.println();
        System.out.println(" Total antall studenter er " + sum + ".");
        //oppgave 5.5
        System.out.println("Fag2 verdier \n" +fag2.toString());
        System.out.println();
        System.out.println();
        System.out.println(fag1 );


    }
}