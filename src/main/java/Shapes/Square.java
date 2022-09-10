package Shapes;

public class Square extends Shape{
    public double lengthOfSide;

    public Square(double base) {
        this.lengthOfSide = base;
    }

    @Override
    public double calculateArea() {
        return this.lengthOfSide * this.lengthOfSide;
    }

}
