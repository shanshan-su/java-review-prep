package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);
        Square box3 = new Square(5);

        double box1Perimeter = box1.getPerimeter();
        double box1Area = box1.getArea();

        double box2Perimeter = box2.getPerimeter();
        double box2Area = box2.getArea();

        System.out.println("box1Perimeter = " + box1Perimeter);
        System.out.println("box1Area = " + box1Area);

        System.out.println("box2Perimeter = " + box2Perimeter);
        System.out.println("box2Area = " + box2Area);


        // How can you determine which getArea and getPerimeter methods are being called on each object?
        // box2 is Rectangle using Rectangle methods and box3 is Square using Square methods
        System.out.println(box3.getPerimeter());
        System.out.println(box3.getArea());


    }
}
