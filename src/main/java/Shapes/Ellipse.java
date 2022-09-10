package Shapes;

public class Ellipse extends Shape{

    public double a;
    public double b;

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return Math.PI * a * b;
    }
}
