package jan7.Polymorphism;

public class Car {
    String brand,model;
    double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void printdetails(){
        System.out.println("Brand,model and price of car "+brand+" "+model+" "+price);

    }
}
