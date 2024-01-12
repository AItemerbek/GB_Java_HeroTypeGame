package units;

import java.util.ArrayList;

public class Crossbowman extends Archer {
    public Crossbowman(String name, int x, int y) {
        super(name, 150, 150, 10,
                30, 1, 0.3, 0.4, x, y, true);
        arrows = 6;
        attackDistance = 6;
    }

    @Override
    public String toString() {
        return ("units.Crossbowman: " + super.toString());
    }

    @Override
    public void step(ArrayList<HeroBase> enemies) {
        HeroBase enemy = getNearestEnemy(enemies);
        int curentDamage = calculateDamage(this,enemy);
        if (!getLiveStatus(this)) {
            System.out.println(this + " is dead...");
            return;
        }
        if (this.arrows > 0) {
            System.out.println(this + " attak " + enemy + " with damage " + curentDamage);
            this.arrows -= 1;
            enemy.hp -= curentDamage;
            if (enemy.hp <=  0) {
                enemy.hp = 0;
                enemy.liveStatus = false;
            }
        }
        else System.out.println(this + " arrows is empty");;
    }
}
