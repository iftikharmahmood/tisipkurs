/** Må forstå logikken i nøstede for løkker
 * Dette er et program som tegner kolonne og linje
 */
package repetisjon.kapittel4;

public class NoedoverBortover {

    public static void main(String[] args) {
        System.out.println(" Dette er et program som tegner kolonne og linje");

        for (int kolonne = 0; kolonne < 10; kolonne++){
            System.out.print(kolonne);
            for (int rad = 0; rad < 10; rad++){
                System.out.print(rad);
            }
            System.out.println();
        }

        for (int kolonne = 0; kolonne < 10; kolonne++){
            for (int rad = 0; rad < kolonne +1; rad++){
                System.out.print("*");
            }
            System.out.println();

        }

        for (int kolonne = 0; kolonne < 10; kolonne++){
            System.out.println(kolonne);
            for (int rad = 0; rad < kolonne +1; rad++){
                System.out.print(rad);
            }
        }

        System.out.println("|");
        for (int kolonne = 0; kolonne < 10; kolonne++){
            for (int rad = 0; rad < kolonne +1; rad++){
                System.out.print("*");
            }
            System.out.println("|");

        }
    }
}

