package restaurant.decorator;

import restaurant.composite.MenuItem;

public abstract class MenuItemDecorator extends MenuItem {
    protected MenuItem item;

    public MenuItemDecorator(MenuItem item) {
        super(item.getName());
        this.item = item;
    }

    @Override
    public void print() {
        item.print();
    }
}
