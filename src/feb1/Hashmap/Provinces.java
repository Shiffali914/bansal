package feb1.Hashmap;

import java.util.*;

public class Provinces {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();

        map1.put("Ontario", 25);
        map1.put("New Brunswick", 13);
        map1.put("BC", 18);
        map1.put("Alberta", 34);
        map1.put("Quebec", 12);
        map1.put("Manitoba", 4);

        Collection<Integer> listofWalmarts = map1.values();

        TreeSet<Integer> set=new TreeSet<>(listofWalmarts);
        System.out.println(set.first());
       System.out.println(set.last());
        System.out.println("");

        System.out.println("List of provinces"+map1.keySet());
        System.out.println("");

        Collection<Integer>list1=map1.values();
        int total=0;
        double avg=0;
        for(Integer sum:list1){
            total=total+sum;
            avg=total/map1.size();
        }
        System.out.println("Total number of walmart"+total);
        System.out.println(" ");
        System.out.println("Avergae number of walmart"+avg);
        System.out.println(" ");

        Collection<String>listkey=map1.keySet();

        List<String>list=new ArrayList<>(listkey);
        Collections.sort(list);
        System.out.println("Sorted list of provinces");
        for(String x:list){
            System.out.println(x+" "+map1.get(x));
        }


    }
}