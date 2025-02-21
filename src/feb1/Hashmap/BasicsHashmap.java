package feb1.Hashmap;
import java.util.*;

public class BasicsHashmap {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("India",60000);
        map.put("Canada",30000);
        map.put("China",90000);

       // System.out.println(map);
      /*  map.put("China",180);           // it will update the value because china is already exist in hashtable
        System.out.println(map);

        //searching

        if(map.containsKey("Thailand")){
            System.out.println("Exist");
        }
        else System.out.println("Not exist");

        System.out.println(map.get("India"));         // it will return the value of india that is 60000
        System.out.println(map.get("Thailand"));    */  // it will return null value because it doesnot exist in map


        //for loop in map
       /* for(Map.Entry<String,Integer> entry1:map.entrySet())
        {
            //System.out.println(entry1);
            System.out.println(entry1.getKey());
            System.out.println(entry1.getValue());
        }

        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }*/

        map.remove("China");
        System.out.println(map);


    }
}
