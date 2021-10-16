package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<List<Integer>> mapped = numbers.stream()
                .map(number -> Arrays.asList(number - 1, number, number + 1))
                .collect(Collectors.toList());

        System.out.println(mapped);

        List<Integer> flattened = numbers.stream()
                .flatMap(number -> Arrays.asList(number - 1, number, number + 1)
                        .stream())
                .collect(Collectors.toList());

        System.out.println(flattened);
    }
}
