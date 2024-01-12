package units;

import java.util.ArrayList;

abstract class Archer extends HeroBase{
    protected int arrows;
    protected float attackDistance;
    public Archer(String name, int maxHealth, int health, int armor, int damage, double criticalChance, double evasion, int x, int y) {
        super(name, maxHealth, health, armor, damage, criticalChance, evasion, x, y);
    }
    public HeroBase getNearestEnemy(ArrayList<HeroBase> enemies){
        HeroBase nearestEnemy = enemies.getFirst();
        float minDistance = position.distance(nearestEnemy.position);
        for (HeroBase enemy : enemies) {
            if (position.distance(enemy.position) < minDistance){
                minDistance = position.distance(enemy.position);
                nearestEnemy = enemy;
            }
        }
        return nearestEnemy;
    }
}
