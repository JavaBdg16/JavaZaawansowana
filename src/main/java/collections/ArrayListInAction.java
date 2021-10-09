package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListInAction {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println(list);

        for (Object element : list) {
            System.out.println(element);
        }

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + " = " + list.get(i));
        }

        System.out.println("First element = " + list.get(0));
        System.out.println("Last element = " + list.get(list.size() - 1));

        list.set(1, "Orange");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove("Blue");
        System.out.println(list);

        list.add("Green");
        list.add("Blue");
        list.add("Orange");
        list.add("Purple");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);

        List c1 = new ArrayList();
        c1.add("Red");
        c1.add("Green");
        c1.add("Blue");

        List c2 = new ArrayList();
        c2.add("Orange");
        c2.add("Purple");
        c2.add("Yellow");

        List a = new ArrayList();
        System.out.println(a);
        System.out.println(a.isEmpty());

        a.addAll(c1);
        a.addAll(c2);

        System.out.println(a);
        System.out.println(a.isEmpty());

        a.removeAll(c1);
        System.out.println(a);

//        for (int i = 0; i < a.size(); i++) {
//            if (a.get(i).equals("Purple")) {
//                a.remove(i);
//            }
//        }

//        for (Object obj : a) {
//            if (obj.equals("Purple")) {
//                a.remove(obj);
//            }
//        }

        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            if ("Purple".equals(iterator.next())) {
                iterator.remove();
            }
        }

        System.out.println(a);
    }
}
