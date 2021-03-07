package exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Product {
    private final String name;
    private final double price;
    private final List<Category> categories = new ArrayList<>();

    public Product(String name, double price, Collection<Category> categories) {
        this.name = name;
        this.price = price;

        if (categories != null) {
            this.categories.addAll(categories);
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List<Category> getCategories() {
        return new ArrayList<>(categories);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name) && Objects.equals(categories, product.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, categories);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categories=" + categories +
                '}';
    }

    static class ProductBuilder {
        private String name;
        private double price;
        private List<Category> categories = new ArrayList<>();

        public static ProductBuilder product() {
            return new ProductBuilder();
        }

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder price(int price) {
            this.price = price;
            return this;
        }

        public ProductBuilder addCategory(Category category) {
            if (category != null) {
                categories.add(category);
            }
            return this;
        }

        public Product buildProduct() {
            return new Product(name, price, categories);
        }
    }
}
