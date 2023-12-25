public class Rogue extends HeroBase{
    public Rogue(String name) {
        super(name, 300, 300, 40);
    }

    @Override
    public String toString() {
        return ("Rogue: " + name);
    }
}
