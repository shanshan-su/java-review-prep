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
        String isContinue = getString();
        return isContinue.equalsIgnoreCase("y") || isContinue.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt(int min, int max) {
        int userInput;
        do {
            System.out.printf("Please enter a whole number between %d and %d: %n", min, max);
            userInput = getInt();
        } while (userInput < min || userInput > max);

        return userInput;
    }

    public int getInt(int min, int max, String prompt) {
        int userInput;
        do {
            System.out.println(prompt);
            userInput = getInt();
        } while (userInput < min || userInput > max);

        return userInput;
    }

    public int getInt() {
        return Integer.parseInt(getString());
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.printf("Please enter a decimal number between %f and %f: %n", min, max);
            userInput = Double.parseDouble(getString());
        } while (userInput < min || userInput > max);

        return userInput;
    }

    public double getDouble(double min, double max, String prompt) {
        double userInput;
        do {
            System.out.println(prompt);
            userInput = Double.parseDouble(getString());
        } while (userInput < min || userInput > max);

        return userInput;
    }

    public double getDouble() {
        System.out.println("Please enter a decimal number.");
        return Double.parseDouble(getString());
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(getString());
    }
}
