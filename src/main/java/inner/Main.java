package inner;

public class Main {

    public static void main(String[] args) {
        Passenger ewa = new Passenger("Ewa", 3, 180);
        Passenger.RewardProgram platinum = new Passenger.RewardProgram();
        platinum.setMemberLevel(3);

        if (ewa.getRewardProgram().getMemberLevel() == platinum.getMemberLevel()) {
            System.out.println("Ewa is platinum");
        }
    }
}
