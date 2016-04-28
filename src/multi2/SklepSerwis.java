package multi2;

import java.util.List;
import java.util.Set;

public class SklepSerwis extends Serwis implements ISklep {
    private Sklep sklep;

    public SklepSerwis(String nazwa, String adres, List<Sprawa> sprawy, Set<Produkt> produkty) {
        super(adres, sprawy);
        sklep = new Sklep(nazwa, produkty);
    }

    public Produkt znajdzProdukt(String name) {
        return sklep.znajdzProdukt(name);
    }

    public String toString() {
        return "Sklep i serwis:\n" + sklep.toString() + "\n" + super.toString();
    }
}
