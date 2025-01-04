package jan4.car;

public class Truck extends vehicle{
    int noofwheels;
    @Override
    public void start() {
        System.out.println("Truck starts ");
    }

    @Override
    public void brake() {
        System.out.println("Truck brakes ");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerate ");
    }


    public boolean canDoWheele(){
        return true;
    }
}
