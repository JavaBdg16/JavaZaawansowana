package collections.maps;

import collections.Product;

import java.util.HashMap;
import java.util.Map;

public class MapProductLookupTable implements ProductLookupTable {

    private final Map<Integer, Product> products = new HashMap<>();

    @Override
    public Product lookupById(int id) {
        return products.get(id);
    }

    @Override
    public void addProduct(Product product) {
        int id = product.getId();

        if (products.containsKey(id)) {
            throw new IllegalArgumentException(
                    "Unable to add product, duplicate for: " + product);
        }

        products.put(id, product);
    }

    @Override
    public void clear() {
        products.clear();
    }
}
