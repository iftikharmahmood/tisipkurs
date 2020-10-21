/** programliste 4.4
 *Oppgave 4.9 oppgave 2
 */
package repetisjon.kapittel4;

public class SumAvTallOppgave2 {

        public static void main(String[] args) {
            int produkt=1;
            int sum = 0;
            for (int linjeTeller = 1; linjeTeller < 10; linjeTeller++){
                produkt *= linjeTeller;
                sum += linjeTeller;

                for (int tall = 1; tall <=linjeTeller; tall++){
                    System.out.print((tall) +" ");
                }
                System.out.println("Summen av hver linje blir "+ sum + " produktet av hver linje blir " + produkt);
            }
        }
    }
