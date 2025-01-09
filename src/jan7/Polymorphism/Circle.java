package jan7.Polymorphism;

public class Circle extends Shape{
    double radius;
    double pie=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }
}
