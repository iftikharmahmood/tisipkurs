package repetisjon.kapittel5;

import static javax.swing.JOptionPane.showInputDialog;

public class MatvareMain {

    public static void main(String[] args) {

        Matvare pomFGkj = new Matvare("pomFritGkj", 1381, 3.8, 39.8);
        Matvare pomFF = new Matvare("pomFritFryst", 641, 2.2, 22);
        Matvare koPo = new Matvare("koktPotet", 339, 1.9, 17.1);


        String vektLest = showInputDialog(" Tast inn vekt på varen du vil ha informasjon om eller tast ESC for å avslutte ");

        while (vektLest != "esc") {
            double vekt = Double.parseDouble(vektLest);
            pomFGkj.getNAVN();
            pomFGkj.tabellHundreGramVare();
            pomFGkj.regnUtNæringsInnhold(vekt);
            System.out.println("                    ******************");

            pomFF.getNAVN();
            pomFF.tabellHundreGramVare();
            pomFF.regnUtNæringsInnhold(vekt);
            System.out.println("                    ******************");

            koPo.getNAVN();
            koPo.tabellHundreGramVare();
            koPo.regnUtNæringsInnhold(vekt);
            System.out.println("                    ******************");

            vektLest = showInputDialog(" Tast inn vekt på varen du vil ha informasjon om eller tast ESC for å avslutte ");

        }
    }
}
