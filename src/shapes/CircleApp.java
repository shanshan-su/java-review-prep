package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        boolean isContinue;

        do {
            double radius = input.getDouble();

            Circle circle = new Circle(radius);
            double circumference = circle.getCircumference();
            System.out.println("circumference = " + circumference);

            double area = circle.getArea();
            System.out.println("area = " + area);

            System.out.println("Would you like to make another circle? (y/n or yes/no)");
//            String nextString = scanner.nextLine();
//            System.out.println("nextString = " + nextString);
//            String nextString2 = scanner.nextLine();
//            System.out.println("nextString2 = " + nextString2);
//
//            isContinue = nextString2.equalsIgnoreCase("y") || nextString2.equalsIgnoreCase("yes");
//            isContinue = input.yesNo();
//            System.out.println("isContinue = " + isContinue);
        } while (input.yesNo());

    }
}
