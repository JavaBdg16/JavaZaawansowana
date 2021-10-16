package threads;

public class StateThreadMain {

    public static void main(String[] args) {

        StateThread stateThread = new StateThread("State Thread");

        try {

            Thread.sleep(1000);
            stateThread.suspend();
            System.out.println("suspend thread " + stateThread.getThread().getName());

            Thread.sleep(1000);
            stateThread.resume();
            System.out.println("resume thread " + stateThread.getThread().getName());

            Thread.sleep(1000);
            stateThread.suspend();
            System.out.println("suspend thread " + stateThread.getThread().getName());

            Thread.sleep(1000);
            stateThread.resume();
            System.out.println("resume thread " + stateThread.getThread().getName());

            stateThread.stop();
            System.out.println("stop thread " + stateThread.getThread().getName());

        } catch (InterruptedException ex) {
            System.out.println("main thread interrupted");
        }

        try {
            stateThread.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread ended");
    }
}
