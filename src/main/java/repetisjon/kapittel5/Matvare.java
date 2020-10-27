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

import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

public class Matvare {
    private final String NAVN;
    private final double ENERGI_KILO_JOULE;
    private final double FETT_GRAM;
    private final double KARBOHYDRATER_GRAM;

    public Matvare(String NAVN, double ENERGI_KILO_JOULE, double FETT_GRAM, double KARBOHYDRATER_GRAM) {
        this.NAVN = NAVN;
        this.ENERGI_KILO_JOULE = ENERGI_KILO_JOULE;
        this.FETT_GRAM = FETT_GRAM;
        this.KARBOHYDRATER_GRAM = KARBOHYDRATER_GRAM;
    }

    public String getNAVN(){
        return NAVN;
    }

    public double getENERGI_KILO_JOULE() {
        return ENERGI_KILO_JOULE;
    }

    public double getFETT_GRAM() {
        return FETT_GRAM;
    }

    public double getKARBOHYDRATER_GRAM() {
        return KARBOHYDRATER_GRAM;
    }

    public void tabellHundreGramVare(){
        double kCal = ENERGI_KILO_JOULE * 4.18;
        System.out.println(" --------= Næringsinnhold pr 100gram for matvaren " + NAVN + " =--------- ");
        System.out.println("           Energi " + ENERGI_KILO_JOULE + " kiloJoule");
        System.out.println("           Energi " + kCal + " kilo Calorier");
        System.out.println("           Fettinnhold " + FETT_GRAM + " gram av  av 100 gram");
        System.out.println("           Karbohydrater " + KARBOHYDRATER_GRAM + " gram av av 100 gram");
        System.out.println(" -----------------====================================---------------------");
    }

    public void regnUtNæringsInnhold(double vekt){
        double energiKiloJoule = (ENERGI_KILO_JOULE /100) * vekt;
        double næringFett = (FETT_GRAM /100) *vekt;
        double næringKarbo = (KARBOHYDRATER_GRAM /100) * vekt;
        double kiloCalorier = energiKiloJoule * 4.18;

        System.out.println();
        System.out.println(" --------= Næringsinnhold for matvaren " + NAVN + " =--------- ");
        System.out.println();
        System.out.println("           Vektmengde " + vekt + " gram");
        System.out.println("           Energi " + energiKiloJoule + " kiloJoule");
        System.out.println("           Energi " + kiloCalorier + " kilo Calorier");
        System.out.println("           Fettinnhold " + næringFett + " gram av " + vekt);
        System.out.println("           Karbohydrater " + næringKarbo + " gram av "+ vekt);
        System.out.println(" -------------====================================--------------");



    }
}
