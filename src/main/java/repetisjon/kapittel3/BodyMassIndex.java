/**
 * Kapittel 3.4 valgstrukturer
 * oppgave 3.4 1b
 * ( Vekt kg / ( Høyde m * Høyde m) ) = Din BMI
 */

package repetisjon.kapittel3;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Din Body Mass Index (BMI) skal regnes ut ");
        System.out.println("Tast inn din høyde i meter");
        double hoyde = scanner.nextDouble();
        System.out.println();
        System.out.println("Tast inn din vekt i kilogram");
        double vekt = scanner.nextDouble();
        scanner.close();

        double bmi= vekt/ ( hoyde * hoyde);

        String bmiStatus;

        if (bmi < 19){
            bmiStatus = "Du er undervektig";
        }
        else
            if (bmi < 26){
                bmiStatus = "Du har normal vekt";
            }
            else if (bmi < 30){
                bmiStatus = "Du har fedme";
            }
            else {
                bmiStatus = "Du er OBESE";
            }
            System.out.println(bmiStatus);
    }
}