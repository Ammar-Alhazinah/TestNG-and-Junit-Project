package Shapes;

public class Parallelogram extends Shape{

    public double base;
    public double height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.base * this.height;
    }
}
