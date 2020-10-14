/**
 * Kapittel 3.4 valgstrukturer
 * oppgave  4
 */

package repetisjon.kapittel3;

public class Tallrekke2 {
   private int a=20;
   private int b=30;
   private int p=20;
   private int q=40;
   private int r=30;
   private int s=15;

        public static void main(String[] args){
            Tallrekke2 tallrekke2 = new Tallrekke2();

            if (tallrekke2.a < tallrekke2.b){
                tallrekke2.a = tallrekke2.b;
                tallrekke2.b = 10;
            }
            if (tallrekke2.p == 20){
                tallrekke2.q = 13;
            }
            else {
                tallrekke2.q = 17;
            }
            if ( tallrekke2.r > tallrekke2.s) {
                tallrekke2.q = 100;
            }
            tallrekke2.s = 200;

            System.out.println("a= "+ tallrekke2.a +", b= "+tallrekke2.b +", p= "+ tallrekke2.p+", q= "+ tallrekke2.q +", r= "+ tallrekke2.r +", s= "+ tallrekke2.s);
        }
}
