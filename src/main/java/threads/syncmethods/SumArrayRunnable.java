package threads.syncmethods;

import java.util.List;

public class SumArrayRunnable implements Runnable {

    public static SumArray sumArray = new SumArray();

    private Thread thread;
    private List<Integer> numbers;
    private int result;

    public SumArrayRunnable(String threadName, List<Integer> numbers) {
        thread = new Thread(this, threadName);
        thread.start();

        this.numbers = numbers;
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " started");
        result = sumArray.sumArray(numbers);

        System.out.println("Result for " + thread.getName() + " = " + result);
        System.out.println(thread.getName() + " ended");
    }
}
