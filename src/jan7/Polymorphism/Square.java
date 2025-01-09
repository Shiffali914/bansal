package jan7.Polymorphism;

public class Square extends Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
