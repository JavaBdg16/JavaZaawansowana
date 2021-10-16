package lambdas;

import generics.StringComparator;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

//        for (int item : items) {
//            System.out.println(item);
//        }

        // Java 8
        PrintStream printWriter = System.out;
        items.forEach(printWriter::println);

        items.forEach(item -> System.out.println(item));

        items.forEach(item -> {
            int sum = item + item;
            System.out.println(sum);
        });

        String[] words = { "Ala", "ma", "kota", "kot", "ma", "Alę" };
//        Arrays.sort(words, new Comparator<String>() {
//            @Override
//            public int compare(String s, String t1) {
//                return Integer.compare(s.length(), t1.length());
//            }
//        });

        Arrays.sort(words, (s1, s2) -> {
            int result = Integer.compare(s1.length(), s2.length());
            if (result == 0) {
                result = s1.compareTo(s2);
            }

            return result;
        });
        System.out.println(Arrays.toString(words));

        method("t1", "t2", (s1, s2) -> {
            //
            //
            //
            //
            //
            return 0;
        });

    }

    static <T> void method(T t1, T t2, FunctionalInterface<? super T> func) {

    }

    static class StringComparator implements Comparator<String> {

        @Override
        public int compare(String s, String t1) {
            return Integer.compare(s.length(), t1.length());
        }
    }

    static interface FunctionalInterface<T> {
        int doSmth(T a1, T a2);
//        int doSmth(T a1);
    }
}
