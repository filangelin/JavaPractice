package practice5.task3;

public class HotDish extends MenuItem {
    private int temperature;

    HotDish(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void display() {
        System.out.println("Температура горячего блюда: " + temperature);
    }
}
