/**
 * 3.12 valg som kontroll strukturer
 * oppgave 3.12
 * oppgave 4
 * Hvilket merke er billigst
 */
package repetisjon.kapittel3;

public class Oppgave4Billigst {

    public static void main(String[] args) {

        double produktA = 35.90 / 450;
        double produktB = 39.50 / 500;
        System.out.println(" Produkt A = " + produktA + " pr gram og produkt B = "+ produktB + " pr gram");

        String message; //= (produktA > produktB) ? "Produkt B er billigst" : " Produkt A er billigst";

        if (produktA > produktB){
            message = "Produkt B er billigst";
        } else if (produktB > produktA){
            message = " Produkt A er billigst";
        } else {
            message = " Begge produktene har lik pris";
        }
        System.out.println(message);
    }
}
