package threads;

public class MyThreadMain {

    public static void main(String[] args) {
        Thread thread = new MyThread();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("My second thread " + Thread.currentThread().getName());
            }
        });

        new Thread(() -> {
            System.out.println("My third thread " + Thread.currentThread().getName());
        }).start();


        thread.start();
        thread1.start();
    }
}
