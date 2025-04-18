package restaurant.decorator;

import restaurant.composite.MenuItem;

public class SpicyDecorator extends MenuItemDecorator {
    public SpicyDecorator(MenuItem item) {
        super(item);
    }

    @Override
    public void print() {
        System.out.print("[Spicy] ");
        item.print();
    }


}
