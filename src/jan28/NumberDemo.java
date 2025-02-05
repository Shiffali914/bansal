package jan28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NumberDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        /*for(Integer i:list){
            if(i%2==0){
                list.remove(i);
                // this will give the concurrentmodification exception
            }
           else {
                System.out.println("odd");
            }*/
        Iterator<Integer> itr= list.iterator();
        while(itr.hasNext()){
            Integer next = itr.next();
            if(next%2==0){
                itr.remove();
            }
        }
        System.out.println(list);
    }

}