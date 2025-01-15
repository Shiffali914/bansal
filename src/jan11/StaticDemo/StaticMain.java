package jan11.StaticDemo;

public class StaticMain {
    public static void main(String[] args) {
        StaticMethodDemo demo=new StaticMethodDemo();
                demo.display();
                StaticMethodDemo.show();    /*static method called by the class name not the object when class is loaded then static
                                              things is loaded  in the method first*/


    }
}
