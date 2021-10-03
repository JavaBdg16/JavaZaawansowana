package enums;

public class CrewMember {
    private FlightCrewJob job;
    private String name;

    public CrewMember(FlightCrewJob job, String name) {
        this.job = job;
        this.name = name;
    }

    public FlightCrewJob getJob() {
        return job;
    }

    public String getName() {
        return name;
    }
}
