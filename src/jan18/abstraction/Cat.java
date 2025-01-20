package jan18.abstraction;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat Meow");
    }

    @Override
    public void Sleep() {
        System.out.println("Cat sleep");
    }
}
