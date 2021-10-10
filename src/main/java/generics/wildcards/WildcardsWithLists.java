package generics.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WildcardsWithLists {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.1d, 2.2d, 3.3d);

        printList(integers);
        printList(doubles);

        printWildcardList(integers);
        printWildcardList(doubles);

        // doSmthWithList(integers);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return 0;
            }
        };

        List<Comparator> comparators = Arrays.asList(comparator);
        doSmthWithList(comparators);

        List<?> wildcardList = new ArrayList<>();
        wildcardList.add(null);
    }

    private static void naivePrintList(List list) {
        System.out.println(list);
    }

    private static <T> void printList(List<T> list) {
        System.out.println(list);
    }

    private static void printWildcardList(List<?> list) {
        System.out.println(list);
    }

    // Object[]
    private static void doSmthWithList(List<?> list) {
        for (Object str : list) {
            // String str2 = (String) str;
        }
    }
}
