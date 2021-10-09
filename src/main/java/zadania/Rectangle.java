package zadania;

public class Rectangle {

    private double length;
    private double width;
    private String color;
    private boolean filled;

    public Rectangle(double length, double width, String color, boolean filled) throws NegativeValueException {
        if (length <= 0 || width <= 0) {
            throw new NegativeValueException("Width and Height must be greater than 0");
        }

        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }
}
