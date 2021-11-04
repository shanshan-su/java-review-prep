package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5, 4);
//        Rectangle box2 = new Square(5);  // polymorphism
//        Square box3 = new Square(5);
//
//        System.out.println("box1 perimeter & area: ");
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//        System.out.println("------------------------");
//
//        System.out.println("box2 perimeter & area: ");
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//        System.out.println("------------------------");
//
//        // How can you determine which getArea and getPerimeter methods are being called on each object?
//        // box2 and box3 are instances of Square class so they are using  methods belonging to square instances
//        System.out.println("box3 perimeter & area: ");
//        System.out.println(box3.getPerimeter());
//        System.out.println(box3.getArea());

        Measurable myShape = new Rectangle(5, 4);

        System.out.println("myShape's area: " + myShape.getArea());
        System.out.println("myShape's perimeter: " + myShape.getPerimeter());

        System.out.println("-------------------------------");

        myShape = new Square(5);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


        // Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
        // Rectangle is not abstract and does not override abstract method getArea() in shapes.Measurable

        // What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//        System.out.println("myShape's length: " + myShape.getLength());
//        System.out.println("myShape's length: " + myShape.getWidth());
//        // cannot find getLength(), getWidth() from Measurable
    }
}
