package jan7.Polymorphism;

public class CarMain {
    public static void main(String[] args) {
        // here upcasting is done because parent class reference can be assigned to child class object


        Car gasoline=new GasolineCar("Swift","ZXI",500000.0);
        Car electric=new ElectricCar("Toyata","RAV4",1000000.0);
        Car diesel=new DieselCar("Honda","Civic",700000.0);
        gasoline.printdetails();
        electric.printdetails();
        diesel.printdetails();
    }
}
