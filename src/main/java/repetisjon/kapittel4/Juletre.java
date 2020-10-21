package repetisjon.kapittel4;

public class Juletre {
    public static void main(String[] args) {
        int linje;
        int rad;
        int plass;

        for (linje = 0; linje < 20; linje++){

            for (rad =0; rad < linje +1;rad++ ){

                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/**
 * solstråle
 *    for (linje = 0; linje < 20; linje++){
 *
 *             for (rad =0; rad < linje +1;rad++ ){
 *                 for (plass=0; plass < linje +; plass++){
 *                     System.out.print(" ");
 *                 }
 *                 System.out.print("*");
 *             }
 *             System.out.println();
 *         }
 */

/**
 * trekant
 *  for (linje = 0; linje < 20; linje++){
 * for (rad =0; rad < linje +1;rad++ ){
 * System.out.print("*");
 * }
 * System.out.println();
 * }
 */