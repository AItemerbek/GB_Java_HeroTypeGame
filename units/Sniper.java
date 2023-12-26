package units;

public class Sniper extends HeroBase{
    public Sniper(String name, int x, int y) {
        super(name, 150, 150, 10, x, y);
    }

    @Override
    public String toString() {
        return ("units.Sniper: " + name + position);
    }
}
