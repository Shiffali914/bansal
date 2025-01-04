package jan4.car;

public class VehicleMain {
     public static void main(String[] args) {
      Car car=new Car();
      MotorBike bike=new MotorBike();
      Aeroplane plane=new Aeroplane();
      Truck truck =new Truck();
      //truck.accelerate();
      vehicle vec=new vehicle();
      //vec.printDetails(4,4);
      car.printDetails(4,4);
      plane.printDetails(3,5);
    }
}
