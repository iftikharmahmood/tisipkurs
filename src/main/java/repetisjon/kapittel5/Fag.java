/**
 * Fag.java  - "Programmering i Java", 4.utgave - 2009-07-01
 * oppgave 5.3 - 1
 * Klassen Fag med attributtene fagkode og antall studenter.
 * Antall studenter kan  endres.
 */
package repetisjon.kapittel5;

class Fag {
    private final String fagkode;
    private int antStud;

    public Fag(String fagkode, int antStud) {
        this.fagkode = fagkode;
        this.antStud = antStud;
    }

    public String getFagkode() {
        return fagkode;
    }

    public int getAntStud() {
        return antStud;
    }

    public void setAntStud(int antStud) {
        this.antStud = antStud;
    }
}