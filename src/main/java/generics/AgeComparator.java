package generics;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person person, Person t1) {
        return Integer.compare(person.getAge(), t1.getAge());
    }
}
