package generics.wildcards;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Partner janKowalski = new Partner("Jan Kowalski", 40);
        Partner ewaNowak = new Partner("Ewa Nowak", 28);
        Employee januszPanasewicz = new Employee("Janusz Panasewicz", 68);

        File file = File.createTempFile("tmp", "people");
        PersonSaver saver = new PersonSaver(file);
        PersonLoader loader = new PersonLoader(file);

        List<Partner> persons = new ArrayList<>();
        persons.add(janKowalski);
        persons.add(ewaNowak);

        saver.saveAll(persons);

        List<Object> people = new ArrayList<>();
        loader.loadAll(people);

        if (file.exists()) {
            file.delete();
        }
    }
}
