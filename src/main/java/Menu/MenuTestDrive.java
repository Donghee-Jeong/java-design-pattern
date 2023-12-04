package Menu;

import Menu.composite.MenuComponent;
import Menu.composite.MenuItem;
import Menu.composite.MenuNode;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent menuComponent = new MenuNode("카페 메뉴", "저녁 메뉴");

        MenuComponent allMenus = new MenuNode("전체 메뉴", "전체 메뉴");
        allMenus.add(menuComponent);

        menuComponent.add(new MenuItem("커피", "고급원두", false, 3.99));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
