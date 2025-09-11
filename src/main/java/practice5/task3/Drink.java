package practice5.task3;

public class Drink extends MenuItem {
    private int volume;

    Drink(int volume) {
        this.volume = volume;
    }

    public void display() {
        System.out.println("Объем напитка: " + volume);
    }

}
