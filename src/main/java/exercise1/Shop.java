package exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Shop {
    private final List<Product> products = new ArrayList<>();

    public Shop(Collection<Product> products) {
        if (products != null) {
            this.products.addAll(products);
        }
    }

    public int getInventoryCount() {
        return products.size();
    }

    public boolean addProduct(Product productToAdd) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productToAdd.getName())) {
                return false;
            }
        }
        products.add(productToAdd);
        return true;
    }


}
