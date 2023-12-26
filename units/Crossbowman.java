package units;

public class Crossbowman extends HeroBase{
    public Crossbowman(String name, int x, int y) {
        super(name, 150, 150, 10, x, y);
    }

    @Override
    public String toString() {
        return ("units.Crossbowman: " + name + position);
    }
}
