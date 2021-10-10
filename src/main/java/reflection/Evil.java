package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Evil {
    static {
        try {

            Field field = Boolean.class.getField("FALSE");
            field.setAccessible(true);

            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
            field.set(null, true);

        } catch (Exception ex) {
            // nas to nie interesuje
        }
    }

    public static void main(String[] args) {

        System.out.printf("Everything is %s", false);

    }
}
