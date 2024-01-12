package units;

import java.util.ArrayList;

abstract public class HeroBase implements Game{
    protected String name;
    protected int maxHp, hp, armor, damage, initiative;
    protected double criticalChance, evasion;
    protected Coordinates position;
    protected boolean liveStatus;


    public HeroBase(String name, int maxHealth, int health, int armor, int damage,
                    int initiative, double criticalChance, double evasion, int x, int y, boolean liveStatus) {
        this.name = name;
        this.maxHp = maxHealth;
        this.hp = health;
        this.armor = armor;
        this.damage = damage;
        this.initiative = initiative;
        this.criticalChance = criticalChance;
        this.evasion = evasion;
        this.position = new Coordinates(x,y);
        this.liveStatus = liveStatus;
    }

    public void getDistance(ArrayList<HeroBase> enemy){
        for (HeroBase heroBase : enemy) {
            System.out.printf("%.2f, ",position.distance(heroBase.position));
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return (name + position);
    }

    @Override
    public void step() {
        System.out.println("Method not implement in this class");
    }
}
