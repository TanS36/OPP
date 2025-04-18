package Poroshayue;

import java.util.ArrayList;
import java.util.List;

// Интерфейс товара
interface ProductV2 {
    String getName();
    double getPrice();
}

// Конкретные классы товаров
class BookV2 implements ProductV2 {
    public String getName() { return "Книга"; }
    public double getPrice() { return 500.0; }
}

class LaptopV2 implements ProductV2 {
    public String getName() { return "Ноутбук"; }
    public double getPrice() { return 50000.0; }
}

class PhoneV2 implements ProductV2 {
    public String getName() { return "Смартфон"; }
    public double getPrice() { return 30000.0; }
}

// Фабрика для создания товаров
class ProductFactoryV2 {
    public static ProductV2 createProduct(String type) {
        switch (type.toLowerCase()) {
            case "book": return new BookV2();
            case "laptop": return new LaptopV2();
            case "phone": return new PhoneV2();
            default: throw new IllegalArgumentException("Неизвестный тип товара: " + type);
        }
    }
}

// Класс магазина
class ShopV2 {
    private List<ProductV2> products = new ArrayList<>();

    public void addProduct(String type) {
        products.add(ProductFactoryV2.createProduct(type));
    }

    public void showProducts() {
        for (ProductV2 product : products) {
            System.out.println(product.getName() + " - " + product.getPrice() + " руб.");
        }
    }
}

// Главный класс
class MainV2 {
    public static void main(String[] args) {
        ShopV2 shop = new ShopV2();
        shop.addProduct("book");
        shop.addProduct("laptop");
        shop.addProduct("phone");

        System.out.println("Товары в магазине:");
        shop.showProducts();
    }
}