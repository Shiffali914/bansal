package jan4.car;

public class Car extends vehicle {
    int numberOfDoors;

    @Override
    public void start() {
        System.out.println("Car starts ");
    }

    @Override
    public void brake() {
        System.out.println("Car brakes...");
    }

    public boolean hasAC() {
        return true;
    }

    /*@Override
    public void printDetails(int numberofWheels, int numberofdoors) {
        super.printDetails(numberofWheels, numberofdoors);
    }*/
}