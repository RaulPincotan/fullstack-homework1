package exercise1;

public class Main {
    public static void main(String[] args) {
        Product product = Product.ProductBuilder
                .product()
                .name("TV")
                .addCategory(Category.ELECTRONICS)
                .price(300)
                .buildProduct();
        System.out.println(product);
    }
}
