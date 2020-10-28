/**
 * Kapittel 5.2
 * småoppgaver
 * Lag en Matvare klasse, Det skal lages 3 objekter med spesifike navn
 * En klient skal kunne finne matvarens navn
 * finne antall gram fett i en bestemt mengde av varen
 * finne energiinnholdet i kJ for en bestemt mengde av varen
 * finne energiinholdet i kcal for en bestemt mengde av varen
 * Klinet sender mende matvare som aktuell argument til objektets mottakervarabil som parameter.
 *
 * DENNE KLASSEN ENDRES SÅ ALLE VERDIER LAGRES PR GRAM OG IKKE I 100 GRAM, SOM EN DEL AV KAPITTEL 5.2 OPPGAVE 6
 */

package repetisjon.kapittel5;

public class Matvare2 {

        private final String NAVN;
        private final double ENERGI_KILO_JOULE;
        private final double FETT_GRAM;
        private final double KARBOHYDRATER_GRAM;

        public Matvare2(String NAVN, double ENERGI_KILO_JOULE, double FETT_GRAM, double KARBOHYDRATER_GRAM) {
            this.NAVN = NAVN;
            this.ENERGI_KILO_JOULE = ENERGI_KILO_JOULE /100;
            this.FETT_GRAM = FETT_GRAM / 100;
            this.KARBOHYDRATER_GRAM = KARBOHYDRATER_GRAM / 100;
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

        public double finnEnergiJoule(double vekt){
            double energiKJ = ENERGI_KILO_JOULE * vekt;
            return energiKJ;
        }

        public double finnEnergiCalories(double vekt){
            double energiKC = (finnEnergiJoule(vekt) * 4.8);
            return energiKC;
        }
        public double finnFett(double vekt){
            double fett = FETT_GRAM * vekt;
            return fett;
        }

        public double finnKarbs(double vekt){
            double karbohydrater = KARBOHYDRATER_GRAM * vekt;
            return karbohydrater;
        }

        public void tabellHundreGramVare(){
            double kCal = ENERGI_KILO_JOULE * 4.18;
            System.out.println(" --------= Næringsinnhold pr. gram for matvaren " + NAVN + " =--------- ");
            System.out.println("           Energi " + ENERGI_KILO_JOULE + " kiloJoule");
            System.out.println("           Energi " + kCal + " kilo Calorier");
            System.out.println("           Fettinnhold " + FETT_GRAM + " gram av  av 100 gram");
            System.out.println("           Karbohydrater " + KARBOHYDRATER_GRAM + " gram av av 100 gram");
            System.out.println(" -----------------====================================---------------------");
        }

        public void regnUtNæringsInnhold(double vekt){
            double energiKiloJoule = ENERGI_KILO_JOULE * vekt;
            double næringFett = FETT_GRAM * vekt;
            double næringKarbo = KARBOHYDRATER_GRAM * vekt;
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
