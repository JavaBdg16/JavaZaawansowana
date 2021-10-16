package threads;

public class TikTakMain {

    public static void main(String[] args) {

        TikTak tikTak = new TikTak();

        TikTakRunnable tikTakRunnable1 = new TikTakRunnable("Tik", tikTak);
        TikTakRunnable tikTakRunnable2 = new TikTakRunnable("Tak", tikTak);

        try {
            tikTakRunnable1.getThread().join();
            tikTakRunnable2.getThread().join();
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
    }
}
