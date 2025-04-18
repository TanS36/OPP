package Poroshayue;

import java.util.ArrayList;
import java.util.List;

// Интерфейс товара
interface ProductV3 {
    String getName();
    double getPrice();
}

// Класс товара с билдером
class ProductImplV3 implements ProductV3 {
    private String name;
    private double price;

    private ProductImplV3(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public static class Builder {
        private String name;
        private double price;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public ProductImplV3 build() {
            return new ProductImplV3(this);
        }
    }
}

// Класс магазина
class ShopV3 {
    private List<ProductV3> products = new ArrayList<>();

    public void addProduct(ProductV3 product) {
        products.add(product);
    }

    public void showProducts() {
        for (ProductV3 product : products) {
            System.out.println(product.getName() + " - " + product.getPrice() + " руб.");
        }
    }
}

// Главный класс
class MainV3 {
    public static void main(String[] args) {
        ShopV3 shop = new ShopV3();

        ProductV3 book = new ProductImplV3.Builder()
                .setName("Книга")
                .setPrice(500.0)
                .build();

        ProductV3 laptop = new ProductImplV3.Builder()
                .setName("Ноутбук")
                .setPrice(50000.0)
                .build();

        ProductV3 phone = new ProductImplV3.Builder()
                .setName("Смартфон")
                .setPrice(30000.0)
                .build();

        shop.addProduct(book);
        shop.addProduct(laptop);
        shop.addProduct(phone);

        System.out.println("Товары в магазине:");
        shop.showProducts();
    }
}
