package feb4;

import java.util.Arrays;
import java.util.List;

public class misc {
    public static void main(String[] args) {
        Integer[] arr={12,45,34,23,56,null};
        List<Integer>list= Arrays.asList(arr);

        list.set(0,10);
        //list.add(null);
        System.out.println(list);

       /* Integer[] arr1=new Integer[]{1,2,3,6,7,};  // this is use above Java 11
        List<Integer>list1 =List.of(arr1);*/

    }
}
