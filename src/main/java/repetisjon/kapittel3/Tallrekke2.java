/**
 * Kapittel 3.4 valgstrukturer
 * oppgave  4
 */

package repetisjon.kapittel3;

public class Tallrekke2 {
    static int a=20;
    static int b=30;
    static int p=20;
    static int q=40;
    static int r=30;
    static int s=15;

        public static void main(String[] args){

            if (a < b){
                a = b;
                b = 10;
            }
            if (p == 20){
                q = 13;
            }
            else {
                q = 17;
            }
            if ( r > s) {
                q = 100;
            }
            s = 200;

            System.out.println("a= "+a+", b= "+b+", p= "+p+", q= "+q+", r= "+r+", s= "+s);
        }
}
