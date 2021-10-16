package threads;

public class StateThread implements Runnable {

    private Thread thread;
    private volatile boolean suspended;
    private volatile boolean stopped;

    public StateThread(String threadName) {
        thread = new Thread(this, threadName);
        suspended = false;
        stopped = false;

        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " stared");

        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(200);
                }

                synchronized (this) {
                    while (suspended) {
                        wait();
                    }

                    if (stopped) {
                        break;
                    }
                }
            }
        } catch (InterruptedException ex) {
            System.out.println(thread.getName() + " interrupted");
        }
    }

    public synchronized void stop() {
        stopped = true;
        suspended = false;
        notify();
    }

    public synchronized void suspend() {
        suspended = true;
    }

    public synchronized void resume() {
        suspended = false;
        notify();
    }

    public Thread getThread() {
        return thread;
    }
}
