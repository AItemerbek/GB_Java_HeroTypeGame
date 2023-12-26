package units;

public class Pikeman extends HeroBase{
    public Pikeman(String name, int x, int y) {
        super(name, 300, 300, 40, x, y);
    }

    @Override
    public String toString() {
        return ("units.Pikeman: " + name + position);
    }
}
