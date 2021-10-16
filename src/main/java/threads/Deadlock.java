package threads;

public class Deadlock {

    private Object key1 = new Object();
    private Object key2 = new Object();

    public void a() {
        synchronized (key1) {
            System.out.println("[" + Thread.currentThread().getName() + "] I am in a()");
            b();
        }
    }

    public void b() {
        synchronized (key2) {
            System.out.println("[" + Thread.currentThread().getName() + "] I am in b()");
            c();
        }
    }

    public void c() {
        synchronized (key1) {
            System.out.println("[" + Thread.currentThread().getName() + "] I am in c()");
        }
    }

    public static void main(String[] args) {

        Deadlock deadlock = new Deadlock();

        Thread thread1 = new Thread(deadlock::a);
        Thread thread2 = new Thread(deadlock::b);

        thread1.start();
        thread2.start();
    }
}
