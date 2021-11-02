package shapes;

public class Square extends Rectangle {
    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Square getPerimeter method:");
        return 4 * side;
    }

    public double getArea() {
        System.out.println("Square getArea method:");
        return side * side;
    }
}
