/**
 * Kapittel 5.2
 * småoppgaver
 * Lag en Matvare klasse, Det skal lages 3 objekter med spesifike navn
 * En klient skal kunne finne matvarens navn
 * finne antall gram fett i en bestemt mengde av varen
 * finne energiinnholdet i kJ for en bestemt mengde av varen
 * finne energiinholdet i kcal for en bestemt mengde av varen
 * Klinet sender mende matvare som aktuell argument til objektets mottakervarabil som parameter.
 */

package repetisjon.kapittel5;

public class Matvare {
    private final String NAVN;
    private double energiKJ;
    private double fettGram;
    private double karbohydraterGram;
    private final String INNHOLD_I_100G_VARE;

    public Matvare(String NAVN, double energiKJ, double fettGram, double karbohydraterGram, String INNHOLD_I_100G_VARE) {
        this.NAVN = NAVN;
        this.energiKJ = energiKJ;
        this.fettGram = fettGram;
        this.karbohydraterGram = karbohydraterGram;
        this.INNHOLD_I_100G_VARE = INNHOLD_I_100G_VARE;
    }

    public String getNAVN(){
        return NAVN;
    }

    public double getEnergiKJ() {
        return energiKJ;
    }

    public void setEnergiKJ(double energiKJ) {
        this.energiKJ = energiKJ;
    }


    public double getFettGram() {
        return fettGram;
    }

    public void setFettGram(double fettGram) {
        this.fettGram = fettGram;
    }

    public double getKarbohydraterGram() {
        return karbohydraterGram;
    }

    public void setKarbohydraterGram(double karbohydraterGram) {
        this.karbohydraterGram = karbohydraterGram;
    }

    public String getINNHOLD_I_100G_VARE() {
        return INNHOLD_I_100G_VARE;
    }
}
