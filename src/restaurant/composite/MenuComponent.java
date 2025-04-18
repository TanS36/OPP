package restaurant.composite;

public abstract class MenuComponent {
    public void add(MenuComponent component) { throw new UnsupportedOperationException(); }
    public void remove(MenuComponent component) { throw new UnsupportedOperationException(); }
    public void print() { throw new UnsupportedOperationException(); }
    public MenuComponent clone() { throw new UnsupportedOperationException(); }
}
