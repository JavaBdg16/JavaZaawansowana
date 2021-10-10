package collections;

import java.util.Objects;

public class Product {

    private int id;
    private final String name;
    private final int weight;

    public Product(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return weight == product.weight && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }
}
