package jan18.abstraction;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.makeSound(); // we cannot create a object of super class because it is abstract class so we are doing run time polymorphism
        // and create a object of child class and assign to the reference of super class which we make abstract class.


    }
}
