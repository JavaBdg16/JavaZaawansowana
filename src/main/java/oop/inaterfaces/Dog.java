package oop.inaterfaces;

public class Dog implements Comparable<Dog> {

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Dog other) {
        if (this.getWeight() < other.getWeight()) {
            return -1;
        } else if (other.getWeight() < this.getWeight()) {
            return 1;
        } else {
            return 0;
        }
    }
}
