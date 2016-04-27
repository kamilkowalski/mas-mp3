package dynamic;

public class Player extends GameCharacter {
    int level;

    public Player(String name, int x, int y, double baseDamage, int level) {
        super(name, x, y, baseDamage);
        setLevel(level);
    }

    public Player(GameCharacter old, int level) {
        this(old.getName(), old.getX(), old.getY(), old.getBaseDamage(), level);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getDamage() {
        return getLevel() * getBaseDamage();
    }
}
