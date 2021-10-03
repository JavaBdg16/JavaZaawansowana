package oop.inaterfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Flight implements Comparable<Flight>, Iterable<Passenger> {
    private int passengers;
    private int seats = 150;
    private ArrayList<Passenger> passengerList = new ArrayList<>();

    @Override
    public int compareTo(Flight passengers) {
        return 0;
    }

    @Override
    public Iterator<Passenger> iterator() {
        return passengerList.iterator();
    }

    public void addPassenger(Passenger passengers) {
        passengerList.add(passengers);
    }
}
