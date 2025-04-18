package restaurant.composite;

import java.util.ArrayList;
import java.util.List;

public class MenuCategory extends MenuComponent {
    private String name;
    private List<MenuComponent> components = new ArrayList<>();

    public MenuCategory(String name) {
        this.name = name;
    }

    @Override
    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void print() {
        System.out.println("Category: " + name);
        for (MenuComponent component : components) {
            component.print();
        }
    }

    @Override
    public MenuComponent clone() {
        MenuCategory copy = new MenuCategory(this.name);
        for (MenuComponent component : components) {
            copy.add(component.clone());
        }
        return copy;
    }
}
