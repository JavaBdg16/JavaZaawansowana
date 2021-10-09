package generics.wildcards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class PersonLoader {

    private final RandomAccessFile file;

    public PersonLoader(File file) throws FileNotFoundException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public Person load() {
        try {
            String className = file.readUTF();
            String personName = file.readUTF();
            int age = file.readInt();

            Class<?> personClass = Class.forName(className);
            Constructor<?> constructor = personClass.getConstructor(String.class, int.class);
            return (Person) constructor.newInstance(personName, age);
        } catch (IOException ex) {
            return null;
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | InvocationTargetException ex) {
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void loadAll(List<? super Person> people) {
        Person person;
        while ((person = load()) != null) {
            people.add(person);
        }
    }
}
