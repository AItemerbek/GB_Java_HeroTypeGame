public class Peasant extends HeroBase{
    public Peasant(String name) {
        super(name, 100, 100, 0);
    }

    @Override
    public String toString() {
        return ("Peasant: " + name);
    }
}
