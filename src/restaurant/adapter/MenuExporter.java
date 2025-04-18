package restaurant.adapter;

import restaurant.composite.MenuComponent;

public interface MenuExporter {
    void export(MenuComponent root);
}
