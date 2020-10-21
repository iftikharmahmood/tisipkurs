/** programliste 4.4
 *Oppgave 4.9 oppgave 3
 * Bare partall skal bli med i sum og produkt
 * Denne forstår jeg ikke
 * Dette funker ikke, ikke på fasiten heller.....
 */

package repetisjon.kapittel4;

public class SumAvTall4_9_3 {

    public static void main(String[] args) {
        int sum = 0;
        int produkt=1;
        boolean partall= true;

        for (int linjeTeller = 2; linjeTeller < 11; linjeTeller++){
            if (partall) {
                produkt *= linjeTeller;
                sum += linjeTeller;
            }

            for (int tall = 1; tall <=linjeTeller; tall++){
                System.out.print(tall +" ");
            }
            System.out.println("Summen av partall blir "+ sum + "  produktet av partall blir " + produkt);
            partall = !partall;
        }
    }
}