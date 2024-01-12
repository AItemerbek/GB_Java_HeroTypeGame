package units;

public class Sorcerer extends Magician{
    public Sorcerer(String name, int x, int y) {
        super(name, 100, 100, 20,
                500, 2, 0.2, 0.2, x, y, true);
        mp = 100;
    }

    @Override
    public String toString() {
        return ("units.Sorcerer: " + super.toString());
    }
}
