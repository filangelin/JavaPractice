package practice5.task3;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void showDescription() {
        for (MenuItem item : items) {
            item.display();
        }
    }
}
