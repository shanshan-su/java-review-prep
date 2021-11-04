package shapes;

public class Square extends Quadrilateral {
    // using the superclass Quadrilateral constructor, we don't need to declare a variable named side since Square extends Quadrilateral
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
//        this.width = side;
        setLength(side);
    }

    public double getPerimeter() {
        System.out.println("Square getPerimeter method:");
//        return this.length * 4;
        double side = length;
        return side * 4;
    }

    public double getArea() {
        System.out.println("Square getArea method:");
//        return this.length * this.length;
        double side = length;
        return side * side;
    }
}
