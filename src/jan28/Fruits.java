package jan28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Fruits {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("pear");
        //System.out.println("List of fruits is");

        System.out.println(fruits);

        /*for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }*/

        /*for(String element: fruits){
            System.out.println(element);
        }*/

        //USING ITERATOR INTERFACE

        ListIterator<String> itr=fruits.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
        System.out.println();
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }

    }
}
