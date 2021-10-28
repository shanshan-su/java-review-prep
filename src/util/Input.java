package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    // constructor
    public Input () {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String isContinue = scanner.nextLine();
        return isContinue.equalsIgnoreCase("y") || isContinue.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String isContinue = scanner.nextLine();
        return isContinue.equalsIgnoreCase("y") || isContinue.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        int userInput;
        do {
            System.out.printf("Please enter a whole number between %d and %d: %n", min, max);
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);

        return userInput;
    }

    public int getInt(int min, int max, String prompt) {
        int userInput;
        do {
            System.out.println(prompt);
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);

        return userInput;
    }

    public int getInt() {
        System.out.println("Please enter a whole number.");
        return scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.printf("Please enter a whole number between %f and %f: %n", min, max);
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);

        return userInput;
    }

    public double getDouble(double min, double max, String prompt) {
        double userInput;
        do {
            System.out.println(prompt);
            userInput = scanner.nextInt();
        } while (userInput < min || userInput > max);

        return userInput;
    }

    public double getDouble() {
        System.out.println("Please enter a decimal number.");
        return scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}
