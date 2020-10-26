package repetisjon.proveeksamen;

public class Dikt {
    private String diktet;
    private  String dikteren;

    public Dikt(String diktet, String dikteren) {
        this.diktet = diktet;
        this.dikteren = dikteren;
    }

    public String getDiktet() {
        return diktet;
    }

    public void setDiktet(String diktet) {
        this.diktet = diktet;
    }

    public String getDikteren() {
        return dikteren;
    }

    public void setDikteren(String dikteren) {
        this.dikteren = dikteren;
    }

 /*   public int compareTo(Dikt annetDikt){
        int svar;
        int sammenlign = this.diktet.length() - getDiktet();
        if (this.diktet.compareTo(String.valueOf(annetDikt)) ){
            svar = -1;
        } else if ( this.diktet.equals(annetDikt)){
            svar =  0;
        } else if (this.diktet < annetDikt){
            svar =  1;
        }
        return svar;
    } */
}
