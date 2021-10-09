package collections.maps;

import collections.Product;

public interface ProductLookupTable {

    Product lookupById(int id);

    void addProduct(Product product);

    void clear();
}
