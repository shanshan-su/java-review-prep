package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    // constructor
    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // getters and setters
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);
}
