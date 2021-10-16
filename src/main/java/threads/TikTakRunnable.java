package threads;

public class TikTakRunnable implements Runnable {

    private Thread thread;
    private TikTak tikTak;
    private final int tikTakCounter = 5;

    public TikTakRunnable(String threadName, TikTak tikTak) {
        this.thread = new Thread(this, threadName);
        this.tikTak = tikTak;

        thread.start();
    }

    @Override
    public void run() {
        if (thread.getName().equals("Tik")) {
            for (int i = 0; i < tikTakCounter; i++) {
                tikTak.tik(true);
            }
            tikTak.tik(false);
        }

        if (thread.getName().equals("Tak")) {
            for (int i = 0; i < tikTakCounter; i++) {
                tikTak.tak(true);
            }
            tikTak.tak(false);
        }
    }

    public Thread getThread() {
        return thread;
    }
}
