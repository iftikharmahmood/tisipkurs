/**
 * Fag.java  - "Programmering i Java", 4.utgave - 2009-07-01
 * oppgave 5.3 - 1
 * Klassen Fag med attributtene fagkode og antall studenter.
 * Antall studenter kan  endres.
 */
package repetisjon.kapittel5;

class Fag {
    // private final String fagkode;
    private String fagkode; // oppgave 5.4 1
    private int antStud;

    public Fag(){

    }
    public Fag(String fagkode){
        this.fagkode = fagkode;
    }

    public Fag(int antStud){
        this.antStud = antStud;
    }

    public Fag(String fagkode, int antStud) {
        this.fagkode = fagkode;
        this.antStud = antStud;
    }

    public String getFagkode() {
        return fagkode;
    }

    public void setFagkode(String fagkode){
        this.fagkode = fagkode;
    }

    public int getAntStud() {
        return antStud;
    }

    public void setAntStud(int antStud) {
        this.antStud = antStud;
    }

   public String toString(){
       return "Fagkode: " + fagkode + ", Antall studenter " + antStud;
   }

    public String ikkeGjørNoe(){
        return null;
    }
}

