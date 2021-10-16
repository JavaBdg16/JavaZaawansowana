package streams;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsInAction {

    public static void main(String[] args) {

        IntStream.range(1, 10).forEach(num -> System.out.print(num + " "));
        System.out.println();
        IntStream.rangeClosed(1, 10).forEach(System.out::println);

        // pipeline --> łańcuch wywołań
        Stream.of("This", "is", "Java", "8", "Stream")
                        .forEach(str -> System.out.print(str + " "));

        String[] strings = new String[] {
                "Streams", "can", "be", "created", "from", "arrays"
        };
        Arrays.stream(strings).forEach(System.out::println);
    }
}
