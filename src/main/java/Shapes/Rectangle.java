package Shapes;

public class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle(double base, double height) {
        this.width = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}
