package jan28.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        HashSet set=new HashSet();      // it does not maintain insertion order

        set.add(10);
        set.add("shiffali");
        set.add(10.55);
        set.add("bansal");
       // set.add("shiffali");
        set.add(true);
        set.add(null);
        //set.add(null);

        //System.out.println(set);
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
