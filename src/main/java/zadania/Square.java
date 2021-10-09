package zadania;

public class Square extends Rectangle {

    private String color;
    private boolean filled;

    public Square(double side, String color, boolean filled) throws NegativeValueException {
        super(side, side, color, filled);
    }
}
