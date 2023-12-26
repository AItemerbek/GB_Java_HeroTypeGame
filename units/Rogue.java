package units;

public class Rogue extends HeroBase{
    public Rogue(String name, int x, int y) {
        super(name, 300, 300, 40, x, y);
    }

    @Override
    public String toString() {
        return ("units.Rogue: " + name + position);
    }
}
