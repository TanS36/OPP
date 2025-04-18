package restaurant;

import restaurant.composite.*;
import restaurant.decorator.SpicyDecorator;
import restaurant.factory.DrinkFactory;
import restaurant.factory.DesertFactory;
import restaurant.facade.MenuManager;
import restaurant.adapter.JsonMenuExporter;

public class Main {
    public static void main(String[] args) {
        //Компоновщик
        MenuCategory rootMenu = new MenuCategory("Main Menu");
        MenuCategory drinks = new MenuCategory("Drinks");
        MenuCategory food = new MenuCategory("Food");
        MenuCategory desert = new MenuCategory("Desert");

        MenuItem tea = new MenuItem("Tea");
        MenuItem coffee = new MenuItem("Coffee");

        drinks.add(tea);
        drinks.add(coffee);

        //Декоратор
        MenuItem burger = new MenuItem("Burger");
        MenuItem spicyBurger = new SpicyDecorator(new MenuItem("Burger"));

        food.add(burger);
        food.add(spicyBurger);

        rootMenu.add(drinks);
        rootMenu.add(food);
        rootMenu.add(desert);

        //Фабрика
        DrinkFactory drinkFactory = new DrinkFactory();
        MenuItem cola = drinkFactory.createDish("Cola");
        drinks.add(cola);

        DesertFactory desertFactory = new DesertFactory();
        MenuItem black_forest_cake = desertFactory.createDish("Black Forest Cake");
        MenuItem wedding_cake = desertFactory.createDish("Wedding Cake");
        desert.add(wedding_cake);
        desert.add(black_forest_cake);

        //Прототип
        MenuItem cloneBurger = (MenuItem) burger.clone();
        food.add(cloneBurger);

        //Фасад и Адаптер
        MenuManager manager = new MenuManager(rootMenu);
        manager.printMenu();

        System.out.println("\nExport:");
        manager.export(new JsonMenuExporter());
    }
}
