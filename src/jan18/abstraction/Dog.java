package jan18.abstraction;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");

    }

    @Override
    public void Sleep() {
        System.out.println("Dog sleeps");
    }
}
