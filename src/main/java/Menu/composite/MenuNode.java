package Menu.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuNode extends MenuComponent {

    List<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public MenuNode(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println(name + " / " + description);

        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
