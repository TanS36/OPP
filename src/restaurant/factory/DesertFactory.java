package restaurant.factory;

import restaurant.composite.MenuItem;

public class DesertFactory extends DishFactory {
    @Override
    public MenuItem createDish(String name) {
        return new MenuItem(name + " (Desert)");
    }
}
