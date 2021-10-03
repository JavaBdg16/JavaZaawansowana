package inner;

public class Passenger implements Comparable {

    private String name;

    @Override
    public int compareTo(Object o) {
        Passenger p = (Passenger) o;
        // <0 gdy this jest lepsze niż p
        int returnValue = p.getRewardProgram().memberLevel - this.getRewardProgram().memberLevel;

        if (returnValue == 0) {
            returnValue = p.getRewardProgram().memberDays - this.getRewardProgram().memberDays;
        }

        return returnValue;
    }

    public static class RewardProgram {
        private int memberLevel;
        private int memberDays;

        public int getMemberLevel() {
            return memberLevel;
        }

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }

        public int getMemberDays() {
            return memberDays;
        }

        public void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }
    }

    private RewardProgram rewardProgram = new RewardProgram();

    public Passenger(String name, int memberLevel, int memberDays) {
        this.name = name;
        rewardProgram.memberLevel = memberLevel;
        rewardProgram.memberDays = memberDays;
    }

    public RewardProgram getRewardProgram() {
        return rewardProgram;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                '}';
    }
}
