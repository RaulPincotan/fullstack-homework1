package exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ProductV2 {
    private final String name;
    private final double price;
    private final List<Category> categories = new ArrayList<>();

    public ProductV2(String name, double price, Collection<Category> categories) {
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
        ProductV2 productV2 = (ProductV2) o;
        return Double.compare(productV2.price, price) == 0 && Objects.equals(name, productV2.name) && Objects.equals(categories, productV2.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, categories);
    }

    @Override
    public String toString() {
        return "ProductV2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", categories=" + categories +
                '}';
    }

    class ProductBuilder {
        public ProductBuilder product() {
            return new ProductBuilder();
        }

    }
}
