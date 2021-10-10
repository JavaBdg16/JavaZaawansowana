package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionInAction {

    public static void main(String[] args) {

        String hello = "Hello";
        Class helloClass = hello.getClass();

        String world = "Hello";
        Class worldClass = world.getClass();

        Class class1 = new Model(1).getClass();
        Class class2 = new Model(2).getClass();

        System.out.println(class1 == class2);

        Class class3 = Model.class;

        System.out.println(class2 == class3);

        try {
            Class class4 = Class.forName("reflection.Model");

            System.out.println(class3 == class4);

            // Class class5 = Class.forName("ala.ma.kota.Model");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class<?> superClass = class1.getSuperclass();
        System.out.println(superClass.getName());

        System.out.println(superClass == class1);
        System.out.println(superClass == Object.class);

        Class<?>[] interfaces = class1.getInterfaces();
        for (Class<?> clss : interfaces) {
            System.out.println(clss.getName());
        }

        try {
            Field declaredField = class1.getDeclaredField("value");
            System.out.println(declaredField);

            int modifiers = declaredField.getModifiers();
            boolean isPrivate = Modifier.isPrivate(modifiers);

            Field field = class1.getField("value");
            System.out.println(field.getName());
        } catch (NoSuchFieldException e) {
            // e.printStackTrace();
        }

        System.out.println();
        Field[] declaredFields = class1.getDeclaredFields();
        Field[] fields = class1.getFields();

        System.out.println("Decalred Fields");
        for (Field f : declaredFields) {
            System.out.println(f);
        }

        System.out.println("Fields");
        for (Field f : fields) {
            System.out.println(f);
        }

        try {
            Method method = class1.getMethod("getValue", Model.class);
            System.out.println("Metoda getValue: " + method);
        } catch (NoSuchMethodException e) {
            // e.printStackTrace();
        }

        Method[] declaredMethods = class1.getDeclaredMethods();
        Method[] methods = class1.getMethods();

        System.out.println("Declared Methods");
        for (Method m : declaredMethods) {
            System.out.println(m + ": " + m.getName());
        }

        System.out.println("Methods");
        for (Method m : methods) {
            System.out.println(m + ": " + m.getName());
        }

        Constructor[] declaredConstructors = class1.getDeclaredConstructors();
        Constructor[] constructors = class1.getConstructors();

        System.out.println("Declared Constructors");
        for (Constructor c : declaredConstructors) {
            System.out.println(c);
        }

        System.out.println("Constructors");
        for (Constructor c : constructors) {
            System.out.println(c);
        }

        try {
            Class<?> modelClass = Class.forName("reflection.Model");
            Constructor<?> constructor = modelClass.getDeclaredConstructor(int.class, String.class);
            constructor.setAccessible(true);
            Model model = (Model) constructor.newInstance(10, "ala ma kota");

            Field field = Model.class.getDeclaredField("str");
            field.setAccessible(true);

            field.set(model, "kot ma alę");

            System.out.println(model);
            // Model mmm = new Model(1, "a");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
