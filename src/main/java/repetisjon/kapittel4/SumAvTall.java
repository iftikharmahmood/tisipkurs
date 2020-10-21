/** programliste 4.4
 *
 */
package repetisjon.kapittel4;

public class SumAvTall {
    public static void main(String[] args) {
        for (int linjeTeller = 0; linjeTeller < 10; linjeTeller++){
            int sum = 0;
            for (int tall = 1; tall <=linjeTeller; tall++){
                sum += tall;
                System.out.print(tall +" ");
            }
            System.out.println("Summen blir "+ sum);
        }
    }
}
