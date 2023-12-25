public class Monk extends HeroBase {
    public Monk(String name) {
        super(name, 100, 100, 20);
    }

    @Override
    public String toString() {
        return ("Monk: " + name);
    }
}
