package feb1.Hashmap;

import java.util.Collection;
import java.util.HashMap;

public class Hashmapimplementation {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("shiffali",30);
        map.put("Gagan",31);
        map.put("harsh",25);
        map.put("neeraj",22);

        Collection<String> key=map.keySet();
        System.out.println(key);
        Collection<Integer>value= map.values();
        System.out.println(value);
    }
}
