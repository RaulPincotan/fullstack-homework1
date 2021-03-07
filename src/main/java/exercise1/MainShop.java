package exercise1;

import java.util.List;

public class MainShop {
    public static void main(String[] args) {
        Shop shop = new Shop(List.of(new Product("LG", 300, List.of(Category.ELECTRONICS))));
        shop.addProduct(new Product("LG", 350, List.of(Category.ELECTRONICS)));
        shop.addProduct(new Product("Margerita", 350, List.of(Category.FOOD)));
        System.out.println(shop.getInventoryCount());

    }
}
