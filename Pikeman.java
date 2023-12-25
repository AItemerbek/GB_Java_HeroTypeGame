public class Pikeman extends HeroBase{
    public Pikeman(String name) {
        super(name, 300, 300, 40);
    }

    @Override
    public String toString() {
        return ("Pikeman: " + name);
    }
}
