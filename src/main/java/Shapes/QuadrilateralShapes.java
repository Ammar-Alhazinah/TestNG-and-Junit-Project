package Shapes;// This Class represent the Shapes with 4 edges
// Shapes.Square | Shapes.Rectangle | Shapes.Parallelogram
// Shapes.Trapezoid have different formula

public class QuadrilateralShapes extends Shape{
    public double width;
    public double height;

    public QuadrilateralShapes(double base, double height) {
        this.width = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }
}
