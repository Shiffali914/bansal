package jan4.car;

public class MotorBike extends vehicle{

        //int Kicks;
    @Override
    public void start() {
        System.out.println("Bike starts ");
    }

    @Override
    public void brake() {
        System.out.println("bike brakes ");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike accelerate ");
    }

    public boolean canDoWheele(){
        return true;
    }


    }
