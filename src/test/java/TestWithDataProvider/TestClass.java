package TestWithDataProvider;

import Shapes.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    @Test(dataProviderClass = DataProviderClass.class , dataProvider = "Data")
    public void calculateArea(String firstParameter, String secondParameter, String thirdParameter, String areaResult, String shapeName) {
        double first = Integer.parseInt(firstParameter);
        double expectedArea = Integer.parseInt(areaResult);
        double actualResult = -1;

        if (shapeName.equals("triangle")) {
            double second = Integer.parseInt(secondParameter);
            Triangle triangle = new Triangle(first, second);
            actualResult = triangle.calculateArea();
        } else if (shapeName.equals("square")) {
            QuadrilateralShapes square = new QuadrilateralShapes(first, first);
            actualResult = square.calculateArea();

        } else if (shapeName.equals("rectangle") || shapeName.equals("parallelogram")) {
            double second = Integer.parseInt(secondParameter);
            QuadrilateralShapes quadrilateralShapes = new QuadrilateralShapes(first, second);
            actualResult = quadrilateralShapes.calculateArea();

        } else if (shapeName.equals("trapezoid")) {
            double second = Integer.parseInt(secondParameter);
            double third = Integer.parseInt(thirdParameter);
            Trapezoid trapezoid = new Trapezoid(first, second, third);
            actualResult = trapezoid.calculateArea();


        } else if (shapeName.equals("circle")) {
            Circle circle = new Circle(first);
            actualResult = circle.calculateArea();
        } else if (shapeName.equals("ellipse")) {
            double second = Integer.parseInt(secondParameter);
            Ellipse ellipse = new Ellipse(first, second);
            actualResult = ellipse.calculateArea();

        } else if (shapeName.equals("sector")) {
            double second = Integer.parseInt(secondParameter);
            Sector sector = new Sector(first, second);
            actualResult = sector.calculateArea();

        }

        Assert.assertEquals(actualResult, expectedArea);

    }
}
