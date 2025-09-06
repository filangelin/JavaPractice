package practice5.task5;

public class Farm {
    private FarmAnimal animal;

    public void addAnimal(FarmAnimal animal) {
        this.animal = animal;
    }

    public void takeCare() {
        animal.need();
        animal.produce();
    }
}
