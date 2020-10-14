/**
 * Programliste 3.4 Kalkulator 3
 */
package repetisjon.kapittel3;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Kalkulator3 {

    public static void main(String[] args) {
        String tall1Lest = showInputDialog("Tall1: ");
        String tall2Lest = showInputDialog("Tall2: ");
        String operatorLest = showInputDialog("Operator +, -, *, /, %  ");
        int tall1 = Integer.parseInt(tall1Lest);
        int tall2 = Integer.parseInt(tall2Lest);
        char operator = operatorLest.charAt(0);

        switch (operator){
            case '+':
                showMessageDialog(null,"Svar: "+ (tall1 + tall2));
                break;
            case '-':
                showMessageDialog(null,"Svar: "+ (tall1 - tall2));
                break;
            case '*':
                showMessageDialog(null,"Svar: " + (tall1 * tall2));
                break;
            case '/':
                showMessageDialog(null,"Svar: " + (tall1 / tall2));
                break;
            case '%':
                showMessageDialog(null,"Svar: " + (tall1 % tall2));
                break;
            default:
                showMessageDialog(null," Ugyldig operator, bruk kun +, -, *, /, %  ");
                break;
        }
    }
}
