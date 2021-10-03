package oop.inaterfaces;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Passenger[] passengers = {
                new Passenger("Ela", 1, 180),
                new Passenger("Robert", 1, 90),
                new Passenger("Jan", 3, 700),
                new Passenger("Joanna", 2, 200)
        };

        Arrays.sort(passengers);

        System.out.println(Arrays.toString(passengers));

        Flight flight = new Flight();
        for (Passenger passenger : passengers) {
            flight.addPassenger(passenger);
        }

        // flight == Iterable<Passenger>
        for (Passenger passenger : flight) {
            System.out.println(passenger);
        }
    }
}
