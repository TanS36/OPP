package restaurant.facade;

import restaurant.composite.MenuCategory;
import restaurant.adapter.MenuExporter;

public class MenuManager {
    private MenuCategory root;

    public MenuManager(MenuCategory root) {
        this.root = root;
    }

    public void printMenu() {
        root.print();
    }

    public void export(MenuExporter exporter) {
        exporter.export(root);
    }
}
