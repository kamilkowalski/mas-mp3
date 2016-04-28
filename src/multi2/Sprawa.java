package multi2;

public class Sprawa {
    private int numerSprawy;
    private String opisSprawy;
    private static int iloscSpraw = 0;

    public Sprawa(String opisSprawy){
        setOpisSprawy(opisSprawy);

        iloscSpraw++;
        setNumerSprawy(iloscSpraw);
    }

    public int getNumerSprawy() {
        return numerSprawy;
    }

    public void setNumerSprawy(int numerSprawy) {
        this.numerSprawy = numerSprawy;
    }

    public String getOpisSprawy() {
        return opisSprawy;
    }

    public void setOpisSprawy(String opisSprawy) {
        this.opisSprawy = opisSprawy;
    }

    public String toString() {
        return "#" + getNumerSprawy() + ": " + getOpisSprawy();
    }
}
