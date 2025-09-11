package practice5.task3;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        MenuItem spagetti = new HotDish(50);
        MenuItem juice = new Drink(300);
        menu.addItem(spagetti);
        menu.addItem(juice);
        menu.showDescription();

    }
}
