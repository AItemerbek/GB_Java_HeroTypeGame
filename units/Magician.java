package units;

public class Magician extends HeroBase{
    protected int mp;
    public Magician(String name, int maxHealth, int health, int armor, int damage, int initiative,
                    double criticalChance, double evasion, int x, int y) {
        super(name, maxHealth, health, armor, damage, initiative, criticalChance, evasion, x, y);
    }
}
