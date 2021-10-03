package oop.composition;

public class Main {

    public static void main(String[] args) {
        Kaczka zoltaKaczka = new Kaczka(null, null, new Piszcz());

        Application application = new Application(new DbLogger());

        // 4 days later

        application.setLogger(new FileLogger());
    }
}
