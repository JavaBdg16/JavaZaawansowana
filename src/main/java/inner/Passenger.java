package inner;

public class Passenger {

    private String name;

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
}
