package dynamic;

public class Monster extends GameCharacter {
    private double damageModifier;

    public Monster(String name, int x, int y, double baseDamage, double damageModifier) {
        super(name, x, y, baseDamage);
        setDamageModifier(damageModifier);
    }

    public Monster(GameCharacter old, double damageModifier) {
        this(old.getName(), old.getX(), old.getY(), old.getBaseDamage(), damageModifier);
    }

    public double getDamageModifier() {
        return damageModifier;
    }

    public void setDamageModifier(double damageModifier) {
        this.damageModifier = damageModifier;
    }

    public double getDamage() {
        return getBaseDamage() * (1 + 1/getDamageModifier());
    }
}
