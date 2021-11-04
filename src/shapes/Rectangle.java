package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
//    protected double length;
//    protected double width;
//
    // constructor
    public Rectangle (double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }


    public double getArea() {
        return this.length * this.width;
    }


    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
