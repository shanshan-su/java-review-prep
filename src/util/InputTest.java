package util;

import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Please enter a string.");
        String string1 = input.getString();
        System.out.println("string1 = " + string1);

        String string2 = input.getString("What's the weather like today?");
        System.out.println("string2 = " + string2);

        System.out.println("Would you like to continue? (y/n or yes/no)");
        boolean ifContinue1 = input.yesNo();
        System.out.println("ifContinue1 = " + ifContinue1);

        boolean ifContinue2 = input.yesNo("Do you like pizza?");
        System.out.println("ifContinue2 = " + ifContinue2);

        double decimalNum1 = input.getDouble();
        System.out.println("decimalNum1 = " + decimalNum1);

        double decimalNum3 = input.getDouble("Please enter a decimal number greater than 5.");
        System.out.println("decimalNum3 = " + decimalNum3);

        double decimalNum2 = input.getDouble(3.00, 19.55);
        System.out.println("decimalNum2 = " + decimalNum2);

        double decimalNum4 = input.getDouble(3.00, 19.55, "Please enter a decimal number between 3 and 19.55.");
        System.out.println("decimalNum4 = " + decimalNum4);

        System.out.println("Please enter a whole number.");
        int wholeNum1 = input.getInt();
        System.out.println("wholeNum1 = " + wholeNum1);

        int wholeNum3 = input.getInt("Please enter a negative whole number.");
        System.out.println("wholeNum3 = " + wholeNum3);

        int wholeNum2 = input.getInt(2, 20);
        System.out.println("wholeNum2 = " + wholeNum2);

        int wholeNum4 = input.getInt(2, 20, "Please enter a whole number between 2 and 20.");
        System.out.println("wholeNum4 = " + wholeNum4);
    }
}
