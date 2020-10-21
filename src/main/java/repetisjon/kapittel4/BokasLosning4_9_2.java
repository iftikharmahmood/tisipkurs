package repetisjon.kapittel4;

public class BokasLosning4_9_2 {

    public static void main(String[] args) {
        System.out.println("Summen blir: 0, og produktet blir: 0.");
        int sum = 0;
        int produkt = 1;
        for (int linjeteller = 1; linjeteller < 10; linjeteller++) {
            produkt *= linjeteller;
            sum += linjeteller;
            for (int tall = 1; tall <= linjeteller; tall++) {
                System.out.print(tall + " ");
            }
            System.out.println("Summen blir: " + sum + ", og produktet blir: " + produkt + ".");
        }
    }
}
