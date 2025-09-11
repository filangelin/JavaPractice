package practice5.task8;

public class Sculpture extends Exhibit {
    @Override
    void showHistory() {
        System.out.println("Скульптурный объект");
    }

    @Override
    void care() {
        System.out.println("Скульптура — нуждается в реставрации");
    }
}
