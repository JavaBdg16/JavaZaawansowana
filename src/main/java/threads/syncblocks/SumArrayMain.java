package threads.syncblocks;

import java.util.Arrays;
import java.util.List;

public class SumArrayMain {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        SumArrayRunnable runnable1 = new SumArrayRunnable("Thread 1", numbers);
        SumArrayRunnable runnable2 = new SumArrayRunnable("Thread 2", numbers);
    }
}
