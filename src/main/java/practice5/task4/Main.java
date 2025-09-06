package practice5.task4;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        SeaCreature starfish = new Starfish();
        aquarium.addCreature(starfish);
        aquarium.demoCreatureBehavior();
    }
}
