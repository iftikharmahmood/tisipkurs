package repetisjon.kapittel5;

public class Sirkel {

    private double radius;
    private String navn;

    Sirkel(double radius, String navn){
        this.radius = radius;
        this.navn = navn;
    }

    public double getRadius() {
        return radius;
    }

    public String getNavn() {
        return navn;
    }

    public double beregnAreal(){
        return (int) Math.PI * (radius * radius);
    }

    public double beregnOmkrets(){
        return (2.0 * Math.PI * radius);
    }

}
