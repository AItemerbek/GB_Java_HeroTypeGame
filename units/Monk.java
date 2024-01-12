package units;

public class Monk extends Magician {
    public Monk(String name, int x, int y) {
        super(name, 100, 100, 20,
                50, 2, 0.2, 0.2, x, y);
        mp = 100;
    }

    @Override
    public String toString() {
        return ("units.Monk: " + super.toString());
    }
}
