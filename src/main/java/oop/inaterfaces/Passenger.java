package oop.inaterfaces;

public class Passenger implements Comparable {

    private String name;
    private int memberLevel; // 3 (platnium), 2 (gold), 1 (silver)
    private int memberDays;

    public Passenger(String name, int memberLevel, int memberDays) {
        this.name = name;
        this.memberLevel = memberLevel;
        this.memberDays = memberDays;
    }


    @Override
    public int compareTo(Object o) {
        Passenger p = (Passenger) o;
        // <0 gdy this jest lepsze niż p
        int returnValue = p.memberLevel - this.memberLevel;

        if (returnValue == 0) {
            returnValue = p.memberDays - this.memberDays;
        }

        return returnValue;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", memberLevel=" + memberLevel +
                ", memberDays=" + memberDays +
                '}';
    }
}
