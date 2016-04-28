package multi2;

import java.util.List;

public class Serwis {
    private String adres;
    private List<Sprawa> sprawy;

    public Serwis(String adres, List<Sprawa> sprawy) {
        setAdres(adres);
        setSprawy(sprawy);
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<Sprawa> getSprawy() {
        return sprawy;
    }

    public void setSprawy(List<Sprawa> sprawy) {
        this.sprawy = sprawy;
    }

    public Sprawa znajdzSprawe(int numerSprawy) {
        for(Sprawa sprawa : sprawy) {
            if (sprawa.getNumerSprawy() == numerSprawy) {
                return sprawa;
            }
        }

        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Adres serwisu: " + getAdres() + "\n");

        for(Sprawa sprawa : getSprawy()) {
            sb.append(sprawa.toString() + "\n");
        }

        return sb.toString();
    }
}
