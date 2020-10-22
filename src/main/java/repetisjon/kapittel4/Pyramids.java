/**
 * Detter er kopiert fra nettet som eksempel
 * Dette er ikke mitt, brukt for læring
 */
package repetisjon.kapittel4;

public class Pyramids {

    public static void main(String[] args) {
        pyramide(10, true);

        pyramide(10, false);
    }
    public static void pyramide(int size, boolean normal){
        String space = " ";
        String star = "* ";
        if(normal){
            for(int i = 0; i < size; i++){
                for(int x = 0; x < size-i; x++){
                    System.out.print(space);
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(star);
                }
                System.out.println();
            }
        }
        else{
            for(int i = size; i > 0; i--){
                for(int x = 0; x <= size-i; x++){
                    System.out.print(space);
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(star);
                }
                System.out.println();
            }
        }
    }

}
