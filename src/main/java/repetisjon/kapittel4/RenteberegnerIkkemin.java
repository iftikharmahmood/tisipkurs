/**
 * Detter er kopiert fra nettet som eksempel
 * Beregning av rentesrente.
 */
package repetisjon.kapittel4;

import java.text.NumberFormat;  // Klasse for numerisk formatering
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class RenteberegnerIkkemin {

    public static void main( String args[] ) {
        double beløp = 0.0;       // totalbeløp ved slutten av hvert år
        double grunnbeløp = 2700000.0;  // grunnbeløpet som blir forrentet
        double rentefot = 0.035;         // rentefot pro anno

        // oppretter formateringsobjekt for kronebeløp
        NumberFormat kroneformat = NumberFormat.getCurrencyInstance();

        // oppretter JTextArea for visning av utskrift
        JTextArea tekstområde = new JTextArea();

        // lager overskrift i tekstområdet
        tekstområde.setText( "år\ttotalbeløp\n" );

        // beregner totalbeløp for hvert år i 10 år
        for ( int år = 1; år <= 20; år++ )
        {
            // beregner nytt beløp for gjeldende år
            beløp = grunnbeløp * Math.pow( 1.0 + rentefot, år );

            // tilføyer en tekstlinje i tekstområdet
            tekstområde.append(år + "\t" + kroneformat.format(beløp) + "\n");
        } // end for

        // viser resultater
        JOptionPane.showMessageDialog( null, tekstområde,
                "Rentesrente", JOptionPane.INFORMATION_MESSAGE );
    } // end main
} // end klasse Renteberegning
