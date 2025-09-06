package practice5.task2;

public class Dog extends Pet{
    @Override
    void feed() {
        System.out.println("Cобака ест сухой корм");
    }

    @Override
    void spendTime() {
        System.out.println("Собака гуляет");
    }
}
