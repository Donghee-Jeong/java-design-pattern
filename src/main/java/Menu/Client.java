package Menu;

public interface Client {
    void printMenu();

    void printBreakfastMenu();

    void printLunchMenu();

    void printVegetarianMenu();

    boolean isItemVegetarian(String name);
}
