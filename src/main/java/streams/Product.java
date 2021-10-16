package streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static streams.ProductCategory.*;

public class Product {

    private ProductCategory category;
    private String name;
    private BigDecimal price;

    public Product(ProductCategory category, String name, BigDecimal price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    private static final List<Product> PRODUCTS = Arrays.asList(
            new Product(FOOD, "Oranges", new BigDecimal("1.65")),
            new Product(FOOD, "Gouda cheese", new BigDecimal("6.79")),
            new Product(CLEANING, "Detergent", new BigDecimal("3.79")),
            new Product(FOOD, "Soft drink", new BigDecimal("1.99")),
            new Product(OFFICE, "Pencils", new BigDecimal("5.79")),
            new Product(FOOD, "Rice", new BigDecimal("2.99")),
            new Product(CLEANING, "Scourer", new BigDecimal("2.29")),
            new Product(FOOD, "Milk", new BigDecimal("1.39")),
            new Product(OFFICE, "Notebook", new BigDecimal("4.99")),
            new Product(FOOD, "Tea", new BigDecimal("4.29")),
            new Product(FOOD, "Tomato sauce", new BigDecimal("1.39")),
            new Product(FOOD, "Peanut butter", new BigDecimal("2.39")),
            new Product(FOOD, "Red bell pepper", new BigDecimal("0.99"))
    );
}
