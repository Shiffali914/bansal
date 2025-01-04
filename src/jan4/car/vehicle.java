package jan4.car;

public class vehicle {
    int numberOfWheels;
    String color;


    public void start(){
        System.out.println("Vehicle starts");
    }

    public void brake(){
        System.out.println("Vehcile brakes");
    }

    public void accelerate(){
        System.out.println("vehcile can accelerate");
    }

    public void printDetails(int numberofWheels,int numberofdoors){
        System.out.println("vehicle details ");
        System.out.println("Number of wheels..."+numberofWheels);
        System.out.println("Number of doors"+numberofdoors);


    }
}

