package oop.composition;

public class Application {

    private Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
