package Menu;

import java.util.HashMap;
import java.util.Map;

public class CafeMenu {
    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("부리토",
                "통 핀토콩과 살사, 구아카몰이 곁들여진 푸짐한 부리토",
                true,
                4.29);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        menuItems.put(name, new MenuItem(name, description, vegetarian, price));
    }

    public Map<String, MenuItem> getMenuItems() {
        return menuItems;
    }
}
