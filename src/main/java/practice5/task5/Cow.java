package practice5.task5;

public class Cow extends FarmAnimal {
    @Override
    void produce() {
        System.out.println("Корова даёт молоко");
    }

    @Override
    void need() {
        System.out.println("Корова нуждается в выпасе");

    }
}
