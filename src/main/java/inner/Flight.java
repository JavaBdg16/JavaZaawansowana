package inner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Flight implements Comparable<Flight>, Iterable<Passenger> {

    private List<Passenger> passengerList = new ArrayList<>();

    @Override
    public int compareTo(Flight passengers) {
        return 0;
    }

    @Override
    public Iterator<Passenger> iterator() {
        return passengerList.iterator();
    }

    public Iterable<Passenger> getOrderedPassengers() {
        // FlightIterable orderedPassengers = new FlightIterable();
        return new FlightIterable();
    }

    public Iterable<Passenger> getPremiumPassengers() {
        Iterable<Passenger> premiumPassengersIterarable = new Iterable<Passenger>() {
            @Override
            public Iterator<Passenger> iterator() {
                List<Passenger> premiumPasserngers = new ArrayList<>();
                for (Passenger passenger : passengerList) {
                    if (passenger.getRewardProgram().getMemberLevel() == 3) {
                        premiumPasserngers.add(passenger);
                    }
                }

                return premiumPasserngers.iterator();
            }
        };

        return premiumPassengersIterarable;
    }

    public void addPassenger(Passenger passenger) {
        passengerList.add(passenger);
    }

    private class FlightIterable implements Iterable<Passenger> {

        @Override
        public Iterator<Passenger> iterator() {
            Passenger[] passengers = new Passenger[passengerList.size()];
            passengerList.toArray(passengers);
            Arrays.sort(passengers);
            return Arrays.asList(passengers).iterator();
        }
    }
}
