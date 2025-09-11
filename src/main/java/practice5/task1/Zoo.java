package practice5.task1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
    }

    public void demoAnimalBehavior() {
        animal.makeSound();
        animal.move();
    }
}
