package enums;

public class Main {

    public static void main(String[] args) {

        check(Colors.BLUE);
        check(Colors.GREEN);
        check(Colors.RED);
    }

    private static void check(Colors colors) {

        if (colors == Colors.BLUE) {
            System.out.println("To jest kolor niebieski");
        }

        if (colors != Colors.RED) {
            System.out.println("To nie jest kolor czerwony");
        }


    }
}
