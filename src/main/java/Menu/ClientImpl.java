package Menu;

import java.util.List;

public class ClientImpl implements Client {
    @Override
    public void printMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinnerMenu dinnerMenu = new DinnerMenu();
        MenuItem[] lunchItems = dinnerMenu.getMenuItems();

        for (MenuItem breakfastItem : breakfastItems) {
            System.out.println(breakfastItem);
        }

        for (MenuItem lunchItem : lunchItems) {
            System.out.println(lunchItem);
        }
    }

    @Override
    public void printBreakfastMenu() {

    }

    @Override
    public void printLunchMenu() {

    }

    @Override
    public void printVegetarianMenu() {

    }

    @Override
    public boolean isItemVegetarian(String name) {
        return false;
    }
}
