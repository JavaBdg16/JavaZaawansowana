package enums;

public class FlightMain {

    public static void main(String[] args) {
        CrewMember ewa = new CrewMember(FlightCrewJob.PILOT, "Ewa");
        CrewMember robert = new CrewMember(FlightCrewJob.FLIGHT_ATTENDANT, "Robert");

        whoIsInCharge(ewa, robert);
    }

    private static void whoIsInCharge(CrewMember crewMember1, CrewMember crewMember2) {
        CrewMember theBoss = crewMember1.getJob().compareTo(crewMember2.getJob()) > 0
                ? crewMember1 : crewMember2;

        System.out.println(theBoss.getName() + " is the boss");

        System.out.println("Boss job weight is " + theBoss.getJob().getWeight());

        System.out.println("lista wartości");
        for (FlightCrewJob fcj : FlightCrewJob.values()) {
            System.out.println(fcj);
        }

        System.out.println("wartość PILOT");
        System.out.println(FlightCrewJob.valueOf("PILOT"));
    }
}
