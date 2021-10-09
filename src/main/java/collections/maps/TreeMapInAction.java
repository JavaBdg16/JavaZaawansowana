package collections.maps;

import collections.Product;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapInAction {

    public static void main(String[] args) {

        Map<Integer, Product> products = new TreeMap<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer i1, Integer i2) {
                return Integer.compare(i1, i2);
            }
        });

        products.put(ViewsOverMaps.door.getId(), ViewsOverMaps.door);
        products.put(ViewsOverMaps.window.getId(), ViewsOverMaps.window);
        products.put(ViewsOverMaps.floorPanel.getId(), ViewsOverMaps.floorPanel);

        System.out.println(products);
    }
}
