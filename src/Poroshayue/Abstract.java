package Poroshayue;

import java.util.ArrayList;
import java.util.List;

// Интерфейс товара
interface Productv4 {
    String getName();
    double getPrice();
}

// Конкретные классы товаров
class Book implements Productv4 {
    public String getName() { return "Книга"; }
    public double getPrice() { return 500.0; }
}

class Laptop implements Productv4 {
    public String getName() { return "Ноутбук"; }
    public double getPrice() { return 50000.0; }
}

class Phone implements Productv4 {
    public String getName() { return "Смартфон"; }
    public double getPrice() { return 30000.0; }
}

// Абстрактная фабрика
interface ProductFactory {
    Productv4 createProduct();
}

// Конкретные фабрики товаров
class BookFactory implements ProductFactory {
    public Productv4 createProduct() {
        return new Book();
    }
}

class LaptopFactory implements ProductFactory {
    public Productv4 createProduct() {
        return new Laptop();
    }
}

class PhoneFactory implements ProductFactory {
    public Productv4 createProduct() {
        return new Phone();
    }
}

// Класс магазина
class ShopFactory {
    private List<Productv4> products = new ArrayList<>();

    public void addProduct(ProductFactory factory) {
        products.add(factory.createProduct());
    }

    public void showProducts() {
        for (Productv4 product : products) {
            System.out.println(product.getName() + " - " + product.getPrice() + " руб.");
        }
    }
}

