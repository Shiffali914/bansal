package jan25.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Add {
    public static void main(String[] args) {
        List<Integer>list1=new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        List<Integer>list2=new ArrayList();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);

        list2.addAll(list1);
        System.out.println(list2);
    }
}
