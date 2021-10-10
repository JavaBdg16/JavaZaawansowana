package reflection;

import generics.wildcards.Person;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Model implements Serializable {

    private int value;
    private String str;

    public Model(int value) {
        this.value = value;
    }

    private Model(int value, String str) {
        this(value);
        this.str = str;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Model{" +
                "value=" + value +
                ", str='" + str + '\'' +
                '}';
    }
}
