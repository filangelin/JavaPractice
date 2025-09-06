package practice5.task2;

public class Cat extends Pet {
    @Override
    void feed() {
        System.out.println("Кошка ест влажный корм");
    }

    @Override
    void spendTime() {
        System.out.println("Кошка играет");
    }
}
