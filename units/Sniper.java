package units;
public class Sniper extends Archer{
    public Sniper(String name, int x, int y) {
        super(name, 150, 150, 10,
                60, 0.3, 0.4, x, y);
        arrows = 3;
        attackDistance = 6;
    }

    @Override
    public String toString() {
        return ("units.Sniper: " + name + position);
    }

}
