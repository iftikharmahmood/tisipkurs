package repetisjon.proveeksamen;

public class FondMain {
    public static void main(String[] args) {
        Fond oppgave1b = new Fond(0.23, 2000, 0.05,0.003);
        System.out.println(oppgave1b.finnFaktiskeRenter());

        Fond oppgave1c = new Fond(0.23, 2000, 0.05,0.003);
        oppgave1c.leggTilFaktiskeRenter();
        System.out.println(oppgave1c.getKapital());
    }
}
