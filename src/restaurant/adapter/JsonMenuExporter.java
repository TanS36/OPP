package restaurant.adapter;

import restaurant.composite.MenuComponent;

public class JsonMenuExporter implements MenuExporter {
    @Override
    public void export(MenuComponent root) {
        System.out.println("Exporting menu as JSON (simulated)...");
        root.print();  // simplify for now
    }
}
