package gr.aueb.cf.ch16.exerices.Exersice2;

public class Circle extends AbstractShape implements IShape, ITwoDimensional, ICircle {

    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return getRadius() * 2 *Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getCircumference() {
        return getRadius() * 2 *Math.PI;
    }
}

