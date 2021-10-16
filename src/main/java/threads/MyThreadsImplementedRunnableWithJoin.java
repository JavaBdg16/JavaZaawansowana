package threads;

public class MyThreadsImplementedRunnableWithJoin implements Runnable {

    private int counter;
    private Thread thread;

    public MyThreadsImplementedRunnableWithJoin(String threadName) {
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

    public Thread getThread() {
        return thread;
    }

    public static void main(String[] args) {
        MyThreadsImplementedRunnableWithJoin thread1
                = new MyThreadsImplementedRunnableWithJoin("Thread 1");

        MyThreadsImplementedRunnableWithJoin thread2
                = new MyThreadsImplementedRunnableWithJoin("Thread 2");

        MyThreadsImplementedRunnableWithJoin thread3
                = new MyThreadsImplementedRunnableWithJoin("Thread 3");

        try {

            // oczekiwanie, dopóki nie zakończą się określone wątki
            thread1.getThread().join();
            System.out.println(thread1.getThread().getName() + " ended");

            thread2.getThread().join();
            System.out.println(thread2.getThread().getName() + " ended");

            thread3.getThread().join();
            System.out.println(thread3.getThread().getName() + " ended");

        } catch (InterruptedException ex) {
            System.out.println("main thread interrupted");
        }

        System.out.println("main thread ended");
    }
}
