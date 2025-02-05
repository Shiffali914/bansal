package jan28.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        /* Set<Integer>set =new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

        System.out.println(set);*/

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);

        List<Integer>list1=new ArrayList<>();

      /*  for(Integer e:list){
            if(!list1.contains(e)){
                list1.add(e);
            }
        }
        System.out.println(list1);*/

       Set<Integer>set1 =new HashSet<>(list);
        System.out.println(set1);

    }
}
