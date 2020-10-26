/** Kapittel 5
 * småoppgaver
 * programliste 5.1
 * oppgave: Endre programmet slik at det går i løkke og leser inn transaksjoner fra bruker
 * Ny saldo skal skrives ut i kommandovinduet.
 * Ved negativ saldo skriv varsel i et meldingsvindu
 */
package repetisjon.kapittel5;

import javax.swing.*;

import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Konto {

    private final long kontonr;
    private final String navn;
    private final double MAXBELØP = 1000000;
    private final Scanner scanner = new Scanner(System.in);
    private double saldo;
    private double beløp;

    Konto(long kontonr, String navn, double saldo){
        this.kontonr = kontonr;
        this.navn = navn;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getKontonr() {
        return kontonr;
    }

    public String getNavn() {
        return navn;
    }

    public double getMAXBELØP() {
        return MAXBELØP;
    }

    public double getBeløp() {
        return beløp;
    }

    public void setBeløp(double beløp) {
        this.beløp = beløp;
    }

    public void lesInnSaldo(){
        System.out.println(" Tast inn beløpet du vil sette inn ");
        beløp = scanner.nextDouble();
        setSaldo(getSaldo() + beløp);
    }

    public void utførTransaksjon(double saldo){
        setSaldo(getSaldo()+saldo);
    }

    public void skrivUtSaldo(){
        if ( saldo >= 0) {
            System.out.println(" Saldo på " + getNavn() + " sin konto " + getKontonr() + " er kroner " + getSaldo());
        } else {
            showMessageDialog(null, " Saldoen på kontoen er negativ, overtrekk vil bli belastet med høy rentesats", "ADVARSEL", JOptionPane.WARNING_MESSAGE);
        }
    }
}

