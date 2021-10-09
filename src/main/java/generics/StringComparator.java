package generics;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        return s.compareTo(t1);
    }
}
