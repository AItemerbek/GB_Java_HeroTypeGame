package units;

import java.util.ArrayList;

public class Pikeman extends Melee {
    protected int shieldStatus;

    public Pikeman(String name, int x, int y) {
        super(name, 300, 300, 30,
                70, 2, 0.1, 0.1, x, y, true);
        shieldStatus = 0;
    }

    @Override
    public String toString() {
        return ("Pikeman: " + super.toString());
    }

    @Override
    public void step(ArrayList<HeroBase> enemies, ArrayList<HeroBase> allies) {
        if (!this.getLiveStatus()) {
            System.out.println(this + " is dead and disappears from the battlefield forever ...");
            return;
        }
        if (shieldStatus == 1) shieldStatus = 0;
        HeroBase enemy = getNearestEnemy(enemies);
        if (enemy == null) return;
        if (this.getDistance(enemy) < 2) {
            super.step(enemies, allies);
        } else {
            position = moveTo(enemy);
            shieldStatus = 1;
        }
        armor = 30 + 30 * shieldStatus;
    }
}
