package shapes;

import util.Input;

public class CircleApp {
    private static int totalCircleNums = 0;

    public static int getTotalCircleNums() {
        return totalCircleNums;
    }

    public static void main(String[] args) {
        Input input = new Input();

        do {
            double radius = input.getDouble();

            Circle circle = new Circle(radius);

            totalCircleNums += 1;

            double circumference = circle.getCircumference();
            System.out.println("circumference = " + circumference);

            double area = circle.getArea();
            System.out.println("area = " + area);

            System.out.println("Would you like to make another circle? (y/n or yes/no)");
        } while (input.yesNo());

        System.out.println("CircleApp.getTotalCircleNums() = " + CircleApp.getTotalCircleNums());

    }
}
