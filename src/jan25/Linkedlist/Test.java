package jan25.Linkedlist;


import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();


        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
           // System.out.println(list);
        }
        System.out.println("null");
        //System.out.println(list);
    }
}
