package generics;

public class SortedPair<T extends Comparable> {

    private final T first;
    private final T second;

    public SortedPair(T first, T second) {

        if (first.compareTo(second) < 0) {
            this.first = first;
            this.second = second;
        } else {
            this.first = second;
            this.second = first;
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "SortedPair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public static void main(String[] args) {

        SortedPair<Integer> integerSortedPair1 = new SortedPair<>(1, 2);
        System.out.println(integerSortedPair1);

        SortedPair<Integer> integerSortedPair2 = new SortedPair<>(2, 1);
        System.out.println(integerSortedPair2);
    }
}
