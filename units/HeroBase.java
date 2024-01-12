package units;

import java.util.ArrayList;

abstract public class HeroBase {
    protected String name;
    protected int maxHp, hp, armor, damage;
    protected double criticalChance, evasion;
    protected Coordinates position;

    protected boolean liveStatus;


    public HeroBase(String name, int maxHealth, int health,
                    int armor, int damage, double criticalChance, double evasion, int x, int y) {
        this.name = name;
        this.maxHp = maxHealth;
        this.hp = health;
        this.armor = armor;
        this.damage = damage;
        this.criticalChance = criticalChance;
        this.evasion = evasion;
        this.position = new Coordinates(x,y);
        this.liveStatus = true;
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
}
