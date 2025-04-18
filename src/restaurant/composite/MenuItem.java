package restaurant.composite;

public class MenuItem extends MenuComponent {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("  Item: " + name);
    }

    @Override
    public MenuComponent clone() {
        return new MenuItem(this.name);
    }

    public String getName() { return name; }
}
