package oop.oven;

public class Oven implements Runnable {

    private String program;
    private int time;
    private int temperature;
    private boolean termocircle;


    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    public void setProgram(int programType) {
        switch (programType) {
            case 1:
                this.temperature = 190;
                this.time = 90;
                this.termocircle = true;
                break;

        }
    }
}
