package Shapes;

public class Trapezoid extends Shape{

    public double a;
    public double b;
    public double height;


    public Trapezoid(double a, double b, double height) {
        this.a = a;
        this.b = b;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (this.a+this.b)*this.height;
    }
}
