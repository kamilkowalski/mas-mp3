package dynamic;

public abstract class GameCharacter {
    private String name;
    private int x, y;
    private double baseDamage;

    public GameCharacter(String name, int x, int y, double baseDamage) {
        setName(name);
        setX(x);
        setY(y);
        setBaseDamage(baseDamage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(double baseDamage) {
        this.baseDamage = baseDamage;
    }

    public abstract double getDamage();

    public String toString() {
        return getClass().getSimpleName() + " " + getName() + " zadaje " + getDamage() + " obrażeń!";
    }
}
