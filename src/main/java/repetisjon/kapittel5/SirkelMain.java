/**  Kapittel 5.2
 * Små oppgaver, oppgave 4
 */
package repetisjon.kapittel5;

public class SirkelMain {

    public static void main(String[] args) {
        Sirkel sirkel = new Sirkel(200, "Sirkel 1");
        Sirkel sirke2 = new Sirkel(400, "Sirkel 2");
        Sirkel sirke3 = new Sirkel(1000, "Sirkel 3");
        Sirkel sirke4 = new Sirkel(4.7, "Sirkel 4");

        System.out.println(" Radisus  på "+ sirkel.getNavn() + " er satt til : " + sirkel.getRadius() + " centimeter");
        System.out.println(" Arealet på " + sirkel.getNavn() + " er " + sirkel.beregnAreal() + " kvadrat centimeter");
        System.out.println( sirkel.getNavn() + " sin omkrets er " + sirkel.beregnOmkrets() + " centimeter");
        System.out.println("*******************************************************************");
        System.out.println();

        System.out.println(" Radisus  på "+ sirke2.getNavn() + " er satt til : " + sirke2.getRadius() + " centimeter");
        System.out.println(" Arealet på " + sirke2.getNavn() + " er " + sirke2.beregnAreal() + " kvadrat centimeter");
        System.out.println( sirke2.getNavn() + " sin omkrets er " + sirke2.beregnOmkrets() + " centimeter");
        System.out.println("*******************************************************************");
        System.out.println();

        System.out.println(" Radisus  på "+ sirke3.getNavn() + " er satt til : " + sirke3.getRadius() + " centimeter");
        System.out.println(" Arealet på " + sirke3.getNavn() + " er " + sirke3.beregnAreal() + " kvadrat centimeter");
        System.out.println( sirke3.getNavn() + " sin omkrets er " + sirke3.beregnOmkrets() + " centimeter");
        System.out.println("*******************************************************************");
        System.out.println();

        System.out.println(" Radisus  på "+ sirke4.getNavn() + " er satt til : " + sirke4.getRadius() + " centimeter");
        System.out.println(" Arealet på " + sirke4.getNavn() + " er " + sirke4.beregnAreal() + " kvadrat centimeter");
        System.out.println( sirke4.getNavn() + " sin omkrets er " + sirke4.beregnOmkrets() + " centimeter");
        System.out.println("*******************************************************************");
        System.out.println();
    }
}
