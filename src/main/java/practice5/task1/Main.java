package practice5.task1;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal elephant = new Elephant();
        zoo.addAnimal(elephant);
        zoo.demoAnimalBehavior();

        Animal bird = new Bird();
        zoo.addAnimal(bird);
        zoo.demoAnimalBehavior();
    }
}
