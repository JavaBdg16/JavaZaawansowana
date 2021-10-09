package collections;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrayListProblem {

    public static void main(String[] args) {

//        String[] objs = new String[10];
//        objs[0] = "Red";
//        objs[1] = 1;

        List a = new ArrayList();
        List<Object> a2 = new ArrayList<>();

        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
//        list.add(1);

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
