package units;

public class Rogue extends Melee{
    protected boolean invisibleStatus;
    public Rogue(String name, int x, int y) {
        super(name, 300, 300, 40,
                70, 3, 0.1, 0.1, x, y);
        invisibleStatus = false;
    }

    @Override
    public String toString() {
        return ("units.Rogue: " + super.toString());
    }
}
