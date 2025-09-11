package practice5.task5;

public class Chicken extends FarmAnimal {
    @Override
    void produce() {
        System.out.println("Курица несёт яйца");
    }

    @Override
    void need() {
        System.out.println("Курица требует зерно");

    }
}
