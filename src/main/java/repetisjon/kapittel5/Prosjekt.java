/** Programeringsoppgave kapittel 9.9
 * oppgave 1
 * Lag en lasse Prosjekt.
 * initier med følgende String Prosjekttittel, String ansvarligNavn, double budsjett
 * lag getters og setters
 * lag en tostringmetode
 *
 * Klienten skal lage et prosjektobjekt og legge inn flere påløpte beløp
 * for hver oppdatering skal all prosjektinformasjon skrives ut.
 */
package repetisjon.kapittel5;

public class Prosjekt {

    private String prosjektittel ="";
    private String ansvarligNavn="";
    private double budsjett;


    public Prosjekt(String prosjektittel){
        this.prosjektittel = prosjektittel;
    }

    public Prosjekt(String prosjektittel, String ansvarligNavn){
        this.prosjektittel = prosjektittel;
        this.ansvarligNavn = ansvarligNavn;
    }

    public Prosjekt(String prosjektittel, String ansvarligNavn, double budsjett){
        this.prosjektittel = prosjektittel;
        this.ansvarligNavn = ansvarligNavn;
        this.budsjett = budsjett;
    }

    public String getProsjektittel() {
        return prosjektittel;
    }

    public String getAnsvarligNavn() {
        return ansvarligNavn;
    }

    public void setBudsjett(double budsjett) {
        this.budsjett = budsjett;
    }

    public double getBudsjett() {
        return budsjett;
    }

    public String toString(){
        return "Prosjekt: " + prosjektittel + ", Ansvarlig prosjketleder " + ansvarligNavn + ", Budsjett hittil: " + budsjett + ". kroner";
    }

    public double oppdaterBudsjett(double beløp){
        budsjett += beløp;
        return budsjett;
    }
}
