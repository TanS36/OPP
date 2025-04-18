package restaurant.factory;

import restaurant.composite.MenuItem;

public abstract class DishFactory {
    public abstract MenuItem createDish(String name);
}
