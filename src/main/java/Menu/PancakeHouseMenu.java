package Menu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("블루베리 팬케이크",
                "신선한 블루베리와 블루베리 시럽으로 만든 팬케이크",
                true,
                3.49);

        addItem("와플",
                "취향에 따라 블루베리나 딸기를 얹을 수 있는 와플",
                true,
                3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
