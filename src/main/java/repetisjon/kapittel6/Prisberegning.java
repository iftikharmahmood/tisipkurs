/**
 * Prisberegning: Oppretter to vareobjekter.
 */


package repetisjon.kapittel6;


import java.util.Scanner;

class Prisberegning {
    public static void main(String[] args) {
        //Vare vare = new Vare("Norgesost", 124, 79.50, 6);
        Vare vare = new Vare("Norgesost", 124);
        System.out.println(vare.toString());
        System.out.println();
        vare.lesKvantum();
        vare.lesPris();
        System.out.println(vare.beregnPris());
        System.out.println(); System.out.println();
        // Nye data lest inn og estattet det som fulgte med fra kontsuktør
       // vare.lesKvantum();
        //vare.lesPris();
        System.out.println(vare.toString());
        System.out.println();
        /** System.out.println(vare.beregnPris());
        System.out.println(); System.out.println();

        Vare poteter = new Vare("Poteter", 100, 10.80,5);
        System.out.println(poteter.toString());
        System.out.println(poteter.beregnPris());
        // Nye data lest inn og estattet det som fulgte med fra kontsuktør
        poteter.lesKvantum();
        poteter.lesPris();
        System.out.println(poteter.toString());
        poteter.beregnPris();
        System.out.println();  System.out.println();

        Vare farin = new Vare("Sukker", 80);
        System.out.println(farin.toString());
        System.out.println();  System.out.println();
        farin.lesPris();
        farin.lesKvantum();
        System.out.println(farin.beregnPris());
        */

    }
}

/* Kjøring av programmet:
124: Norgesost, pris pr. kg kr 79,50 u.moms.
*/
