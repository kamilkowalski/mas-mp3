package multi2;

import java.util.Set;

public class Sklep implements ISklep {
    private String nazwa;
    private Set<Produkt> prodoukty;

    public Sklep(String nazwa, Set<Produkt> produkty) {
        setNazwa(nazwa);
        setProdoukty(produkty);
    }

    public Set<Produkt> getProdoukty() {
        return prodoukty;
    }

    public void setProdoukty(Set<Produkt> prodoukty) {
        this.prodoukty = prodoukty;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Produkt znajdzProdukt(String nazwa) {
        for(Produkt produkt : getProdoukty()) {
            if (produkt.getName().equals(nazwa)) {
                return produkt;
            }
        }

        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Nazwa sklepu: " + getNazwa());

        for(Produkt produkt : getProdoukty()) {
            sb.append(" - " + produkt.toString() + "\n");
        }

        return sb.toString();
    }
}
