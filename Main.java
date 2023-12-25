import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        createTeams(10);
        System.out.println("Darkside team:");

        darkSide.forEach(n-> System.out.println(n.toString()));
        System.out.println("Lightside team:");
        lightSide.forEach(n-> System.out.println(n.toString()));
    }

    static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length - 1)].toString();
    }

    static void createTeams(int numbers) {
        for (int i = 0; i < numbers; i++) {
            darkSide.add(getRandomHero(random.nextInt(3,7)));
            lightSide.add(getRandomHero(random.nextInt(4)));
        }
    }

    static HeroBase getRandomHero(int choice) {
        switch (choice) {
            case 0:
                return new Monk(getName());
            case 1:
                return new Pikeman(getName());
            case 2:
                return new Crossbowman(getName());
            case 3:
                return new Peasant(getName());
            case 4:
                return new Sorcerer(getName());
            case 5:
                return new Rogue(getName());
            case 6:
                return new Sniper(getName());
        }
        return null;
    }

    static Random random = new Random();
    static ArrayList<HeroBase> darkSide = new ArrayList<>();
    static ArrayList<HeroBase> lightSide = new ArrayList<>();
}
