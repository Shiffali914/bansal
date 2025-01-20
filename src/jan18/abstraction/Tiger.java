package jan18.abstraction;

public class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println("Tiger eats");
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger roar");
    }

    @Override
    public void Sleep() {
        System.out.println("Tiger sleeps");
    }
}
