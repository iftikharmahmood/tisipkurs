/**
 * Kapittel 3.4 valgstrukturer
 * oppgave  2
 */

package repetisjon.kapittel3;

public class Tallrekker {

    public static void main(String[] args){
        int a=20;
        int b=30;
        int c=40;

        if (a > b){
            a = b;
        }
        else {
            a = c;
            b=50;
            if (a>50) {
                a = 100;
            }
        }
        System.out.println("a= " + a + ", b= " + b + ", c= " + c);
    }

}
