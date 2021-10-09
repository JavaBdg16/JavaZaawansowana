package collections.maps;

import collections.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ViewsOverMaps {

    private static Product door = new Product(1, "Wooden Door", 35);
    private static Product floorPanel = new Product(2, "Floor Panel", 25);
    private static Product window = new Product(3, "Glass window", 10);

    public static void main(String[] args) {

        Map<Integer, Product> products = new HashMap<>();
        products.put(window.getId(), window);
        products.put(door.getId(), door);
        products.put(floorPanel.getId(), floorPanel);

        System.out.println(products);

        Set<Integer> ids = products.keySet();
        System.out.println(ids);

        System.out.println();

        ids.remove(1);
        System.out.println(ids);
        System.out.println(products);

        // ids.add(4);

        Collection<Product> values = products.values();
        System.out.println(values);

        values.remove(window);
        System.out.println(products);

        // values.add(window);

        System.out.println();

        products.put(window.getId(), window);
        products.put(door.getId(), door);

        Set<Map.Entry<Integer, Product>> entries = products.entrySet();
        for (Map.Entry<Integer, Product> entry : entries) {
            System.out.println("Entry: " + entry);
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

        Map.Entry<Integer, Product> entry = Map.entry(4, new Product(4, "Table", 60));
        // entries.add(entry);

        System.out.println(products);
    }
}
