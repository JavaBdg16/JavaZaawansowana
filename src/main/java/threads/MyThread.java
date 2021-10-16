package threads;

public class MyThread extends Thread {

    public MyThread() {
        this.setName("My-first-thread");
    }

    @Override
    public void run() {
        System.out.println("My first thread");
        System.out.println(Thread.currentThread().getName());
    }
}
