package jan7.Polymorphism;

public class ShapeMain {
    public static void main(String[] args) {

        //upcasting here is done means parent class reference can be assigned to child class object

        Shape shape=new Square(20.0);

        /*runtime polymorphism because it will depend on object type which object of class is assign to parent class reference
       and it will all on JVM which method is executed during run time */
        System.out.println("Area "+shape.getArea());
    }
}
