package units;
public class Crossbowman extends Archer{
    public Crossbowman(String name, int x, int y) {
        super(name, 150, 150, 10,
                60, 1, 0.3, 0.4, x, y);
        arrows = 3;
        attackDistance = 6;
    }

    @Override
    public String toString() {
        return ("units.Crossbowman: " + super.toString());
    }
}
