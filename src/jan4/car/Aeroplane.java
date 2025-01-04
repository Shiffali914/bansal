package jan4.car;

public class Aeroplane extends vehicle {
    @Override
    public void start() {
        System.out.println("Plane starts");
    }

    @Override
    public void brake() {
        System.out.println("Plane brakes");
    }

    @Override
    public void accelerate() {
        System.out.println("It can fly.... ");
    }

    public boolean canFlyInAir() {
        return true;
    }
}