/**
 * Kapittel 4.9
 */
package repetisjon.kapittel4;

public class Oppgave4_9_1og_2og_3fasit {

  //  Oppgave 1
    public static void main(String[] args) {
        int sum = 0;
        for (int linjeteller = 0; linjeteller < 10; linjeteller++) {
            sum += linjeteller;
            for (int tall = 1; tall <= linjeteller; tall++) {
                System.out.print(tall + " ");
            }
            System.out.println("Summen blir: " + sum);
        }

        System.out.println();

  //  Oppgave 2
    // Velger å spesialbehandle 0 før vi går inn i løkka:

        System.out.println("Summen blir: 0, og produktet blir: 0.");
        int sum2 = 0;
        int produkt = 1;
        for (int linjeteller = 1; linjeteller < 10; linjeteller++) {
            produkt *= linjeteller;
            sum2 += linjeteller;
            for (int tall = 1; tall <= linjeteller; tall++) {
                System.out.print(tall + " ");
            }
            System.out.println("Summen blir: " + sum2 + ", og produktet blir: " + produkt + ".");
        }

        System.out.println();

    // Oppgave 3
    // Velger å spesialbehandle 0 og 1 før vi går inn i løkka:

        System.out.println("Summen av partallene blir: 0, og produktet blir: 0.");
        System.out.println("1 Summen av partallene blir: 0, og produktet blir: 0.");
        int sum3 = 0;
        int produkt2 = 1;
        boolean partall = true; // første tall er partall
        for (int linjeteller = 2; linjeteller < 10; linjeteller++) {
            if (partall) {
                produkt2 *= linjeteller;
                sum3 += linjeteller;
            }
            for (int tall = 1; tall <= linjeteller; tall++) {
                System.out.print(tall + " ");
            }
            System.out.println("Summen av partallene blir: " + sum3
                    + ", og produktet blir: " + produkt2 + ".");
            partall = !partall; // annethvert tall er partall
        }
    }
}
