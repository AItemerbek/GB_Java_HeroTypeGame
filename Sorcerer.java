public class Sorcerer extends HeroBase{
    public Sorcerer(String name) {
        super(name, 100, 100, 20);
    }

    @Override
    public String toString() {
        return ("Sorcerer: " + name);
    }
}
