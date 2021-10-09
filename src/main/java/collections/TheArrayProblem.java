package collections;

import java.util.Arrays;

public class TheArrayProblem {

    public static void main(String[] args) {

        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);

        // Tworzenie
//        Product[] products = new Product[2];
//        products[0] = door;
//        products[1] = floorPanel;

        Product[] products = { door, floorPanel };

        // Wypisywanie
        System.out.println(products);
        System.out.println(Arrays.toString(products));

        // Dodanie
        Product window = new Product("Glass Window", 10);
        // products[2] = window;
        products = add(window, products);
        System.out.println(Arrays.toString(products));

        // Duplikaty
        products = add(window, products);
        System.out.println(Arrays.toString(products));
    }

    private static Product[] add(Product product, Product[] array) {
        int length = array.length;
        Product[] newArray = Arrays.copyOf(array, length + 1);
        newArray[length] = product;
        return newArray;
    }
}
