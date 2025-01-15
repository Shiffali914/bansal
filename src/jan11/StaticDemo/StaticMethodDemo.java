package jan11.StaticDemo;

public class StaticMethodDemo {



    public static void show(){
       System.out.println("Inside the static method");
    }
    public void display(){
        System.out.println("Inside the normal method");
    }

    // precedence of all
    static{
        System.out.println("INside the static block");
    }

    //instance block
    // this belongs to the object of the class
    {
        System.out.println("inside the instance block");
    }
}





/*
static  -------->       1.variable
                            static int x=10; //shareable property of class you can utilize the memory management

                        2.method
                            we don't need to create an object to call that method. That method belongs to class.

                        3.class
                            we will talk about this during nested class

                        4.block
                            static block is loaded first when class is loaded then other functions is loaded

 */