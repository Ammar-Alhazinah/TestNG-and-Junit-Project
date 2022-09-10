package Shapes;

public class Sector extends Shape{

    public double radius;
    public double angle;

    public Sector(double radius, double angle) {
        this.radius = radius;
        this.angle = angle;
    }

    @Override
    public double calculateArea() {
        return  0.5 * this.radius * this.radius * this.angle;
    }
}
