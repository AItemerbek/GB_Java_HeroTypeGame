package units;

import java.util.ArrayList;

public class Rogue extends Melee {
    protected int invisibleStatus;

    public Rogue(String name, int x, int y) {
        super(name, 300, 300, 30,
                70, 2, 0.1, 0.1, x, y, true);
        invisibleStatus = 0;
    }

    @Override
    public String toString() {
        return ("Rogue: " + super.toString());
    }

    @Override
    public void step(ArrayList<HeroBase> enemies, ArrayList<HeroBase> allies) {
        if (!this.getLiveStatus()) {
            System.out.println(this + " is dead and disappears from the battlefield forever ...");
            return;
        }
        if (invisibleStatus == 1) invisibleStatus = 0;
        HeroBase enemy = getNearestEnemy(enemies);
        if (enemy == null) return;
        if (this.getDistance(enemy) < 2) {
            super.step(enemies, allies);
        } else {
            position = moveTo(enemy);
            invisibleStatus = 1;
        }
        evasion = 0.1 + 0.5 * invisibleStatus;
    }
}
