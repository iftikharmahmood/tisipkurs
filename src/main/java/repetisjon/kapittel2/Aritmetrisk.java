/*
  Kpittel 2.8 side 72-73
  oppgave 1 - 4
 */

package repetisjon.kapittel2;

public class Aritmetrisk {
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
        System.out.println(" Opp 2.8  3");
        System.out.println(c+d*a);
        System.out.println(a*b/c+a);
        System.out.println(c%d);
        System.out.println(d%c);
        System.out.println(p%q);
        System.out.println(q%p);
        System.out.println(c%d%a+b/c);
        a=b=16;
        System.out.println(a);


        System.out.println(" Opp 2.8  4");
        System.out.println((b*b)-(4*a*b));
        System.out.println((x * x)+(y * y)+(z * z));
        System.out.println(x * x * x);
        System.out.println((a-b)*(a+b));
        System.out.println(a+b);
        System.out.println(c+d);

    }
}
