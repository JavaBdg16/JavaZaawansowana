package threads;

public class TikTak {

    public synchronized void tik(boolean isRunning) {
        if (!isRunning) {
            notify();
            return;
        }

        System.out.print("Tik ");
        notify();

        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public synchronized void tak(boolean isRunning) {
        if (!isRunning) {
            notify();
            return;
        }

        System.out.println("Tak");
        notify();

        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
