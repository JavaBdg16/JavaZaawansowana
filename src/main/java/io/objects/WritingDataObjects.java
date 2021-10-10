package io.objects;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WritingDataObjects {

    public static void main(String[] args) {

        String fileName = "files/person.bat";
        File file = new File(fileName);

        Person p1 = new Person("Jan Kowalski", 28);
        Person p2 = new Person("Ewa Nowak", 20);

        try (OutputStream outputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {

            List<Person> people = new ArrayList<>();
            Arrays.asList(p1, p2);
            people.add(p1);
            people.add(p2);
//            objectOutputStream.writeObject(p1);
//            objectOutputStream.writeObject(p2);

            objectOutputStream.writeObject(people);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            System.out.println(fileName + " size = " + Files.size(Paths.get(fileName)));
        } catch (IOException ex) {
            // TODO
        }
    }
}
