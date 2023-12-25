public class Sniper extends HeroBase{
    public Sniper(String name) {
        super(name, 150, 150, 10);
    }

    @Override
    public String toString() {
        return ("Sniper: " + name);
    }
}
