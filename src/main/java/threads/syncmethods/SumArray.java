package threads.syncmethods;

import java.util.List;

public class SumArray {

    private int sum;

    public synchronized int sumArray(List<Integer> numbers) {
        sum = 0;

        numbers.forEach(number -> {
            sum += number;
            System.out.println(
                    "Current sum for "
                            + Thread.currentThread().getName() + " = " + sum);
        });

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }

        return sum;
    }
}
