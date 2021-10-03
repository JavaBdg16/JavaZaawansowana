package inner;

public class Main {

    public static void main(String[] args) {
        Passenger ewa = new Passenger("Ewa", 3, 180);
        Passenger.RewardProgram platinum = new Passenger.RewardProgram();
        platinum.setMemberLevel(3);

        if (ewa.getRewardProgram().getMemberLevel() == platinum.getMemberLevel()) {
            System.out.println("Ewa is platinum");
        }

        Flight flight = new Flight();
        flight.addPassenger(new Passenger("Ewa", 3, 180));
        flight.addPassenger(new Passenger("Robert", 1, 90));
        flight.addPassenger(new Passenger("Barbara", 2, 120));
        flight.addPassenger(new Passenger("Kacper", 3, 200));

        for (Passenger passenger : flight) {
            System.out.println(passenger);
        }

        System.out.println();
        System.out.println();

        for (Passenger passenger : flight.getOrderedPassengers()) {
            System.out.println(passenger);
        }
    }
}
