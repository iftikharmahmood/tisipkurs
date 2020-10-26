package repetisjon.proveeksamen;

public class Fond {
    private  final double SKATTESATS;
    private  double kapital;
    private double rentesats;
    private double forvaltningshonorar;

    public Fond(double SKATTESATS, double kapital, double rentesats, double forvaltningshonorar) {
        this.SKATTESATS = SKATTESATS;
        this.kapital = kapital;
        this.rentesats = rentesats;
        this.forvaltningshonorar = forvaltningshonorar;
    }

    public double getSKATTESATS() {
        return SKATTESATS;
    }

    public double getKapital() {
        return kapital;
    }

    public void setKapital(double kapital) {
        this.kapital = kapital;
    }

    public double getRentesats() {
        return rentesats;
    }

    public void setRentesats(double rentesats) {
        this.rentesats = rentesats;
    }

    public double getForvaltningshonorar() {
        return forvaltningshonorar;
    }

    public void setForvaltningshonorar(double forvaltningshonorar) {
        this.forvaltningshonorar = forvaltningshonorar;
    }

    public double finnFaktiskeRenter(){
        double faktiskRente = kapital * getRentesats();
        return faktiskRente;
    }


    public void leggTilFaktiskeRenter(){
        kapital += finnFaktiskeRenter();
    }
}
