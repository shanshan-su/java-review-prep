package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);  // polymorphism
        Square box3 = new Square(5);

        System.out.println("box1 perimeter & area: ");
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());
        System.out.println("------------------------");

        System.out.println("box2 perimeter & area: ");
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
        System.out.println("------------------------");

        // How can you determine which getArea and getPerimeter methods are being called on each object?
        // box2 and box3 are instances of Square class so they are using  methods belonging to square instances
        System.out.println("box3 perimeter & area: ");
        System.out.println(box3.getPerimeter());
        System.out.println(box3.getArea());


    }
}
