package repetisjon.kapittel5;

public class EnKonto {
    public static void main(String[] args) {

        Konto olesKonto = new Konto(123456789, "Ole Olsen", 2300.50);
        olesKonto.utførTransaksjon(1000);
        double saldo = olesKonto.getSaldo();
        System.out.println(" Etter insnkudd er saldo på Oles konto lik : " +saldo);
        System.out.println();
        olesKonto.skrivUtSaldo();

        olesKonto.lesInnSaldo();
        olesKonto.skrivUtSaldo();
        while ( olesKonto.getBeløp() !=0 || olesKonto.getSaldo() >= 0 ){

            olesKonto.lesInnSaldo();
            olesKonto.skrivUtSaldo();
            if (olesKonto.getBeløp() < 0 || olesKonto.getSaldo() >= 0){
                break;
            }
        }
    }
}
