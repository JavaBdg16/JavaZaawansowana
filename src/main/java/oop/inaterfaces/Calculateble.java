package oop.inaterfaces;

public interface Calculateble {
    public static final int VALUE = 253;

    void calculate(int leftValue, int rightValue);

    default void print() {

    }

    // DON'T DO THAT !!!!!!!!!!!!!!!!!!!
    static int doSmth() {
        return 0;
    }
}
