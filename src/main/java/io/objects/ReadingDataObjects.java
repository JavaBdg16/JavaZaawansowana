package io.objects;

import java.io.*;
import java.util.List;

public class ReadingDataObjects {

    public static void main(String[] args) {

        String fileName = "files/person.bat";
        File file = new File(fileName);

        try (InputStream inputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {

            List<Person> people = (List<Person>) objectInputStream.readObject();
            System.out.println(people);

        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
