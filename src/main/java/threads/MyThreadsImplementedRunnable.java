package threads;

public class MyThreadsImplementedRunnable implements Runnable {

    private int counter;
    private Thread thread;

    public MyThreadsImplementedRunnable(String threadName) {
        this.thread = new Thread(this, threadName);
        counter = 0;

        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " starts");

        try {
            do {
                Thread.sleep(500);
                System.out.println(thread.getName() + ", counter = " + counter);
                counter++;
            } while (counter < 10);
        } catch (InterruptedException ex) {
            System.out.println("Interrupted thread " + thread.getName());
        }

        System.out.println("Thread " + thread.getName() + " ended");
    }

    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        MyThreadsImplementedRunnable thread1
                = new MyThreadsImplementedRunnable("Thread 1");

        MyThreadsImplementedRunnable thread2
                = new MyThreadsImplementedRunnable("Thread 2");

        MyThreadsImplementedRunnable thread3
                = new MyThreadsImplementedRunnable("Thread 3");

        do {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("main thread interrupted");
            }

        } while (thread1.getCounter() != 10
                    || thread2.getCounter() != 10
                    || thread3.getCounter() != 10);

        System.out.println("Main thread ended");
    }
}
