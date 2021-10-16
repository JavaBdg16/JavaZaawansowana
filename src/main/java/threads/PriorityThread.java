package threads;

public class PriorityThread implements Runnable {

    private int counter;
    private Thread thread;

    public static boolean stop = false;
    public static String currentThreadName = "";

    public PriorityThread(String threadName) {
        thread = new Thread(this, threadName);
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " started");

        do {

            counter++;
            if (!currentThreadName.equals(thread.getName())) {
                currentThreadName = thread.getName();
                System.out.println(currentThreadName);
            }

        } while (stop == false && counter < 1000000);

        stop = true;
        System.out.println(thread.getName() + " ended");
    }

    public int getCounter() {
        return counter;
    }

    public Thread getThread() {
        return thread;
    }

    public static void main(String[] args) {

        PriorityThread priorityThread1 = new PriorityThread("Hight priority");
        PriorityThread priorityThread2 = new PriorityThread("Low priority");

        priorityThread1.getThread().setPriority(Thread.MAX_PRIORITY);
        priorityThread2.getThread().setPriority(Thread.MIN_PRIORITY);

        priorityThread1.getThread().start();
        priorityThread2.getThread().start();

        try {
            priorityThread1.getThread().join();
            priorityThread2.getThread().join();
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }

        System.out.println("High priority thread counter = " + priorityThread1.getCounter());
        System.out.println("Low priority thread counter = " + priorityThread2.getCounter());
    }
}
