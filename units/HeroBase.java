package units;

import java.util.ArrayList;

abstract public class HeroBase {
    protected String name;
    protected int maxHealth, health, armor;
    protected Coordinates position;


    public HeroBase(String name, int maxHealth, int health,
                    int armor, int x, int y) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = health;
        this.armor = armor;
        this.position = new Coordinates(x,y);
    }

    public void getDistance(ArrayList<HeroBase> enemy){
        for (HeroBase heroBase : enemy) {
            System.out.printf("%.2f, ",position.distance(heroBase.position));
        }
        System.out.println();
    }
}
