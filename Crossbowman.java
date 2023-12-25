public class Crossbowman extends HeroBase{
    public Crossbowman(String name) {
        super(name, 150, 150, 10);
    }

    @Override
    public String toString() {
        return ("Crossbowman: " + name);
    }
}
