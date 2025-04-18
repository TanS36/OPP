package Poroshayue;

import java.util.ArrayList;
import java.util.List;

// Интерфейс товара
interface Product extends Cloneable {
    String getName();
    double getPrice();
    Product clone();
}

// Класс товара с прототипированием
class ProductImpl implements Product {
    private String name;
    private double price;
    private String shopName;

    public ProductImpl(String shopName, String name, double price) {
        this.shopName = shopName;
        this.name = name;
        this.price = price;
    }

    public String getName() { return shopName + " - " + name; }
    public double getPrice() { return price; }

    @Override
    public Product clone() {
        return new ProductImpl(this.shopName, this.name, this.price);
    }
}

// Класс магазина
class Shop {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Shop(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product.clone());
    }

    public void showProducts() {
        for (Product product : products) {
            System.out.println(product.getName() + " - " + product.getPrice() + " руб.");
        }
    }

    public String getName() {
        return name;
    }
}

// Главный класс
class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("Poroshayue");

        Product bookPrototype = new ProductImpl(shop.getName(), "Книга", 500.0);
        Product laptopPrototype = new ProductImpl(shop.getName(), "Ноутбук", 50000.0);
        Product phonePrototype = new ProductImpl(shop.getName(), "Смартфон", 30000.0);

        shop.addProduct(bookPrototype);
        shop.addProduct(laptopPrototype);
        shop.addProduct(phonePrototype);

        System.out.println("Товары в магазине " + shop.getName() + ":");
        shop.showProducts();
    }
}