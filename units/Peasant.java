package units;

public class Peasant extends HeroBase{
    public Peasant(String name, int x, int y) {
        super(name, 100, 100, 0,
                0, 4, 0, 0.2, x, y, true);
    }

    @Override
    public String toString() {
        return ("units.Peasant: " + name + position);
    }
}
