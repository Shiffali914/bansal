package jan25.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);

        ls.add(3, 60);
        System.out.println(ls.get(4));
        System.out.println(ls.contains(new Integer(100)));
        ls.set(5, 500);
        //ls.remove(5);
        System.out.println(ls.indexOf(new Integer(30)));

        Object[] object = ls.toArray();
        for (Object i : object) {
            System.out.println(i);
        }

        //ls.add("Hello");
        //System.out.println(ls);
    }
}
