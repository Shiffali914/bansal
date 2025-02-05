package jan25.Generic;

public class BoxMain {
    public static void main(String[] args) {


        //Generics= A concept where you can write a class, interface or method
        //          that is compatible with different data types
        //<T> type parameter (placeholder that gets replaced with a real type)
        //<String> type argument(specifies the type)


        Box<Double,Integer> box=new Box<>(25.0,15);
        //System.out.println(box.toString());
        System.out.println(box.getLength());
        System.out.println(box.getWidht());
    }
}
