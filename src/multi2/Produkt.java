package multi2;

public class Produkt {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Produkt(String name) {
        setName(name);
    }

    public String toString() {
        return getName();
    }
}
