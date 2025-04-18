package restaurant.factory;

import restaurant.composite.MenuItem;

public class DrinkFactory extends DishFactory {
    @Override
    public MenuItem createDish(String name) {
        return new MenuItem(name + " (Drink)");
    }
}
