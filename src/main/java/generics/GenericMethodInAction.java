package generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericMethodInAction {

    public static void main(String[] args) {

        Person janKowalski = new Person("Jan Kowalski", 40);
        Person ewaNowak = new Person("Ewa Nowak", 28);
        Person januszPanasewicz = new Person("Janusz Panasewicz", 68);

        List<Person> persons = new ArrayList<>();
        persons.add(janKowalski);
        persons.add(ewaNowak);
        persons.add(januszPanasewicz);

        Person youngestPerson = min(persons, new AgeComparator());
        System.out.println(youngestPerson);

        List<String> strs = new ArrayList<>();
        strs.add("Blue");
        strs.add("Yellow");
        strs.add("Orange");

        String lowestString = min(strs, new StringComparator());
        System.out.println(lowestString);

        lowestString = min(strs, new ReverseComparator<>(new StringComparator()));
        System.out.println(lowestString);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(78);
        numbers.add(11);
        numbers.add(99);

        Integer lowestInteger = min(numbers, Integer::compare);
        System.out.println(lowestInteger);
    }

    private static <T> T min(List<T> values, Comparator<T> comparator) {
        if (values.isEmpty()) {
            throw new IllegalArgumentException("List is empty, connot find minimum");
        }

        T lowestElement = values.get(0);

        for (int i = 1; i < values.size(); i++) {

            T element = values.get(i);
            if (comparator.compare(element, lowestElement) < 0) {
                lowestElement = element;
            }
        }

        return lowestElement;
    }
}
