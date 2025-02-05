package jan21;

class Laptop{

    //static inner class
    static class HardDrive{
        int capacity=100;

        public void store(){
                 System.out.println("Drive Storage Cap"+capacity);

                 //local inner Class
                 /*class MyClass{

                 }*/
        }
    }
}
public class StaticInnerDemo {
    public static void main(String[] args) {
        Laptop.HardDrive obj=new Laptop.HardDrive();
        obj.store();
    }
}
