package Menu;

import java.util.List;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(List.of(pancakeHouseMenu, dinnerMenu, cafeMenu));
        waitress.printMenu();
    }
}
