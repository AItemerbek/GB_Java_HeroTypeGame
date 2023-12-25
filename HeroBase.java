abstract public class HeroBase {
    protected String name;
    protected int maxHealth, health, armor;


    public HeroBase(String name, int maxHealth, int health, int armor) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = health;
        this.armor = armor;
    }
}
