package streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductStreamsInAction {

    public static void main(String[] args) {

        List<Product> products = Product.PRODUCTS;

        // LAZY start

        Stream<Product> stream = products.stream()
                .map(product -> {
                    System.out.println(product);
                    return product;
        });

        // LAZY end

        stream.forEach(product -> {});

        System.out.println();
        System.out.println("FOOD:");
        products.stream()
                .filter(product -> product.getCategory() == ProductCategory.FOOD)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Nazwa produktu i cena");
        products.stream()
                .map(product -> String.format(
                        "The price of %s is $ %.2f",
                        product.getName(),
                        product.getPrice())
                )
                .forEach(System.out::println);

        System.out.println();
        System.out.println("map vs flat map");
//        System.out.println("map:");
//
        Pattern spaces = Pattern.compile("\\s+");
//        products.stream()
//                .map(product -> spaces.splitAsStream(product.getName()))
//                .forEach(arr -> System.out.println(arr));

        System.out.println("flat map");

        products.stream()
                .flatMap(product -> spaces.splitAsStream(product.getName()))
                .forEach(arr -> System.out.println(arr));

        Optional<Product> opt = products.stream()
                .filter(product -> product.getCategory() == ProductCategory.OFFICE)
                .findFirst();

        opt.ifPresent(System.out::println);

        opt = products.stream()
                .filter(product -> product.getCategory() == ProductCategory.OFFICE)
                .findAny();

        opt.ifPresent(System.out::println);

        boolean isCleaningProduct = products.stream()
                .anyMatch(product -> product.getCategory() == ProductCategory.CLEANING);
        System.out.println("Does tge list of products contains cleaning product? " + isCleaningProduct);

        boolean isProductsAreExpensive = products.stream()
                .allMatch(product -> product.getPrice().compareTo(new BigDecimal("10.0")) > 0);
        System.out.println("Are all products expensive? " + isProductsAreExpensive);

        boolean isProductsAreCheap = products.stream()
                .noneMatch(product -> product.getPrice().compareTo(new BigDecimal("10.0")) > 0);
        System.out.println("Are all products cheap? " + isProductsAreCheap);

        List<Product> foodProducts = new ArrayList<>();
        products.stream()
                .filter(product -> product.getCategory() == ProductCategory.FOOD)
                .forEach(foodProducts::add);
//                .forEach(product -> foodProducts.add(product));

        System.out.println(foodProducts);

        foodProducts = products.stream()
                .filter(product -> product.getCategory() == ProductCategory.OFFICE)
                .collect(Collectors.toList());

        System.out.println(foodProducts);

        List<String> cleaningProductNames = products.stream()
                .filter(product -> product.getCategory() == ProductCategory.CLEANING)
                .map(product -> product.getName())
                .collect(Collectors.toList());

        System.out.println(cleaningProductNames);

        String categories = products.stream()
                .map(product -> product.getCategory().toString())
                .distinct()
                .collect(Collectors.joining(";"));

        System.out.println(categories);

        List<String> sortedNames = products.stream()
                .map(Product::getName)
//                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedNames);
    }
}
