package units;

public class Melee extends HeroBase{

    public Melee(String name, int maxHealth, int health, int armor, int damage, int initiative,
                 double criticalChance, double evasion, int x, int y, boolean liveStatus) {
        super(name, maxHealth, health, armor, damage, initiative, criticalChance, evasion, x, y, liveStatus);
    }
}
