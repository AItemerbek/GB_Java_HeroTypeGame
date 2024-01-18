package units;

import java.util.ArrayList;

public class Sorcerer extends Magician{
    public Sorcerer(String name, int x, int y) {
        super(name, 100, 100, 5,
                50, 3, 0.1, 0.2, x, y, true);
        mp = 100;
    }

    @Override
    public String toString() {
        return ("Sorcerer: " + super.toString());
    }

}
