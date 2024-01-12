package units;

public class Magician extends HeroBase{
    protected int mp;
    public Magician(String name, int maxHealth, int health, int armor, int damage, double criticalChance, double evasion, int x, int y) {
        super(name, maxHealth, health, armor, damage, criticalChance, evasion, x, y);
    }
}
