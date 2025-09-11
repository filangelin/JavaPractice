package practice5.task4;

public class Aquarium {
    private SeaCreature creature;

    public void addCreature(SeaCreature creature) {
        this.creature = creature;
    }

    public void demoCreatureBehavior() {
        creature.move();
    }
}
