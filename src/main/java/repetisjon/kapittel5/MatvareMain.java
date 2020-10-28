/**
 *
 */

package repetisjon.kapittel5;

import static javax.swing.JOptionPane.showInputDialog;

public class MatvareMain {

    public static void main(String[] args) {
        double vekt = 0;

        Matvare pomFGkj = new Matvare("pomFritGkj", 1381, 3.8, 39.8);
        Matvare pomFF = new Matvare("pomFritFryst", 641, 2.2, 22);
        Matvare koPo = new Matvare("koktPotet", 339, 1.9, 17.1);

        //Test av Matvare2 klassen oppgave 5.2 6
        Matvare2 koktPottit = new Matvare2("Kokt Potet", 3.39, 0.019,0.171);

        String vektLest = showInputDialog(" Tast inn vekt på varen du vil ha informasjon om eller tast ESC for å avslutte ");

        while (vektLest != "esc") {
            vekt = Double.parseDouble(vektLest);
            pomFGkj.getNAVN();
            pomFGkj.tabellHundreGramVare();
            pomFGkj.regnUtNæringsInnhold(vekt);
            System.out.println();
            System.out.println("                    ******************");
            System.out.println();

            pomFF.getNAVN();
            pomFF.tabellHundreGramVare();
            pomFF.regnUtNæringsInnhold(vekt);
            System.out.println();
            System.out.println("                    ******************");
            System.out.println();

            koPo.getNAVN();
            koPo.tabellHundreGramVare();
            koPo.regnUtNæringsInnhold(vekt);
            System.out.println();
            System.out.println("                    ******************");
            System.out.println();

            vektLest = showInputDialog(" Tast inn vekt på varen du vil ha informasjon om eller tast ESC for å avslutte ");

            System.out.println();
            System.out.println(" Energi innholdet i Pommes Frites fra Gatekjøkken er " + pomFGkj.finnEnergiJoule(vekt) + " kiloJoule (kJ)");
            System.out.println(" Fett innholdet i Pommes Frites fra Gatekjøkken er " + pomFGkj.finnFett(vekt) + " gram");
            System.out.println(" Karbohytrat innholdet i Pommes Frites fra Gatekjøkken er " + pomFGkj.finnKarbs(vekt) + " gram");
            System.out.println(" Energi innholdet i Pommes Frites fra Gatekjøkken er " + pomFGkj.finnEnergiCalories(vekt) + " kilo calorier (kCal)");
            System.out.println();
            System.out.println(" Fettinnhold i " + koktPottit.getNAVN() + " er" + koktPottit.finnFett(vekt) + " gram");

        }
    }
}
