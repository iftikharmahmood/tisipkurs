package repetisjon.kapittel5.NyeLøsninger;

public class Simulator {
    Spiller A = new Spiller("Dervis");
    Spiller B = new Spiller("Iftikhar");

    public void spillHundre(){
        int runde = 1;
        int poeng;
        while (!A.erFerdig() || !B.erFerdig()){
            A.kastTerningen();
            B.kastTerningen();
            runde++;
        }
        if (A.erFerdig()){
            System.out.println("Spiller " + A.getSpillerNavn() + " Oppnådde 100 poeng først og vant");
            System.out.println(" A vant i runde" + runde);
            System.out.println("B: " + B.getSumPoeng() + ", ferdig" + B.erFerdig());
        } else {
            System.out.println("Spiller " + B.getSpillerNavn() + " Oppnådde 100 poeng først og vant");
            System.out.println(" B vant i runde" + runde);
            System.out.println("A: " + A.getSumPoeng() + ", ferdig" + A.erFerdig());
        }
    }
}
