package feb1;

import java.util.Scanner;
import java.util.TreeSet;

public class TestDemo {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<>();

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the string");
        String string1=scanner.nextLine();

      /*  set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

        System.out.println(set.ceiling(60));            // ya toh equal value ya esse vadda value return de dega
        System.out.println(set.floor(10));*/            //



       // String s="I am learing java in pragra. Today is Java class in pragra";
        String [] words=string1.split(" ");
        for(String s2: words){

           // System.out.println(s2);
           set.add(s2);

        }
        System.out.println(set);
    }
}
