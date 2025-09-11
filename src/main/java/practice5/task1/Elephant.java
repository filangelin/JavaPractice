package practice5.task1;

public class Elephant extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cлон трубит");
    }

    @Override
    void move() {
        System.out.println("Cлон ходит");
    }
}
