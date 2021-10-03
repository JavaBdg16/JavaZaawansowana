package enums;

public enum FlightCrewJob {

    FLIGHT_ATTENDANT(1),   // 0
    COPILOT(2),            // 1
    PILOT(3);              // 2

    private int weight;

    FlightCrewJob(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
