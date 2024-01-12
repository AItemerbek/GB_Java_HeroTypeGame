package units;

import java.util.ArrayList;

public class Sniper extends Archer{
    public Sniper(String name, int x, int y) {
        super(name, 150, 150, 10,
                60, 1, 0.3, 0.4, x, y, true);
        arrows = 3;
        attackDistance = 6;
    }

    @Override
    public String toString() {
        return ("units.Sniper: " + super.toString());
    }

    public void step(ArrayList<HeroBase> enemies) {
        HeroBase enemy = getNearestEnemy(enemies);
        int currentDamage = calculateDamage(this,enemy);
        if (!getLiveStatus(this)) {
            System.out.println(this + " is dead...");
            return;
        }
        if (this.arrows > 0) {
            System.out.println(this + " attak " + enemy + " with damage " + currentDamage);
            this.arrows -= 1;
            enemy.hp -= currentDamage;
            if (enemy.hp <=  0) {
                enemy.hp = 0;
                enemy.liveStatus = false;
            }
        }
        else System.out.println(this + " arrows is empty");;
    }

}
