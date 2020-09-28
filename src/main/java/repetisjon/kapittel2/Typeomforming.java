/**
 * Kapittel 2.8
 * oppgave 1 - 3
 */

package repetisjon.kapittel2;

public class Typeomforming {

    public static int a = 10;
    public static int b = 5;
    public static int c = 3;
    public static int d = 2;
    public static double p = 2.8;
    public static double q = 3.3;

    public static char x = 'X';
    public static char y = 'Y';
    public static char z = 'Z';

    public static void main(String[] args){
        System.out.println(" Opp 2.8  1");
        System.out.println(p+(double) a/q);
        System.out.println(" int a blir castet av seg selv til double  "+ (p+a/q));
        System.out.println(" casting av begge tall til int)  gir svar på 5 dabbe tall etter komma fjernes  "+(int)p+ (int)q);
        System.out.println("Kun p castes til int dermed følger 0,3 fra q med i beregningen  "+((int)p+q));



        System.out.println(" Opp 2.8  2");
        System.out.println(" blir 0    "+ (d = d/b));
        System.out.println(" blir 0           " + (b = d*c));
        System.out.println(" blir a=p+q må castes før beregning     " + (a = (int) (p+ q)));
        System.out.println("blir 5       " + (a= (int)p+ (int)q));
        System.out.println(" blir 9  " +(a+4));

        System.out.println(" Opp 2.8  3");
        System.out.println(a = (int) (20000000000L* 30));
        System.out.println(b = (int) 20000000000L* 30);
        System.out.println(20000000000L * 30);
        System.out.println(b = (int) 20000000000L* 30);
        System.out.println(c = (int) (2e10*30));
        System.out.println("a= "+a+"  b= " +b);
        System.out.println((int)3e7);

    }
}
