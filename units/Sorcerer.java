package units;

public class Sorcerer extends HeroBase{
    protected int mp;
    public Sorcerer(String name, int x, int y) {
        super(name, 100, 100, 20,
                500, 0.2, 0.2, x, y);
        mp = 100;
    }

    @Override
    public String toString() {
        return ("units.Sorcerer: " + name + position);
    }
}
