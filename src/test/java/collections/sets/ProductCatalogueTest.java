package collections.sets;

import collections.Product;
import collections.Supplier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductCatalogueTest {

    public static Product door = new Product("Wooden Door", 35);
    public static Product floorPanel = new Product("Floor Panel", 25);
    public static Product window = new Product("Glass Window", 10);

    @Test
    public void shouldNotRecordDuplicateProducts() {

        Supplier oknoplast = new Supplier("Oknoplast");
        oknoplast.getProducts().add(window);

        Supplier drutex = new Supplier("Drutex");
        drutex.getProducts().add(door);
        drutex.getProducts().add(floorPanel);
        drutex.getProducts().add(window);

        ProductCatalogue productCatalogue = new ProductCatalogue();
        productCatalogue.addSupplier(oknoplast);
        productCatalogue.addSupplier(drutex);

        assertEquals(3, productCatalogue.getProducts().size());
    }
}
