import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MethodsExercises {
    // 1. Basic Arithmetic
    //
    //Create four separate methods. Each will perform an arithmetic operation:
    //
    //Addition

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    //Subtraction

    public static int minus(int num1, int num2) {
        return num1 - num2;
    }

    //Multiplication

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    //Division

    public static double divide(int num1, int num2) {
        return (double) num1 / num2;
    }

    //Each function needs to take two parameters/arguments so that the operation can be performed.
    //
    //Test your methods and verify the output.
    //
    //Add a modulus method that finds the modulus of two numbers.
    //
    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    //Food for thought: What happens if we try to divide by zero? What should happen? // Infinity

    // Bonus
    //
    // a. Create your multiplication method without the * operator (Hint: a loop might be helpful).

    public static int loopMultiply(int num1, int num2) {
        int result = 0;
        for (int i = 1; i <= num2; i++) {
            result += num1;
        }
        return result;
    }

    // b. Do the above with recursion.
    public static int multiplyRecursion(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1 + loopMultiply(num1, num2 - 1);
        }
    }


    // 2. Create a method that validates that user input is in a certain range
    //
    //The method signature should look like this:
    //
    //
    //public static int getInteger(int min, int max);
    //and is used like this:
    //
    //
    //System.out.print("Enter a number between 1 and 10: ");
    //int userInput = getInteger(1, 10);
    //If the input is invalid, prompt the user again.
    //
    //Hint: recursion might be helpful here!

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput >= min && userInput <= max) {
            System.out.printf("The user input between %d and %d is: %d%n", min, max, userInput);
            return userInput;
        } else {
            System.out.printf("Enter a number between %d and %d: %n", min, max);
            return getInteger(min, max);
        }
    }

    // 3. Calculate the factorial of a number.
    //
    //Prompt the user to enter an integer from 1 to 10.
    //Display the factorial of the number entered by the user.
    //Ask if the user wants to continue.
    //Use a for loop to calculate the factorial.
    //Assume that the user will enter an integer, but verify it’s between 1 and 10.
    //Use the long type to store the factorial.
    //Continue only if the user agrees to.
    //A factorial is a number multiplied by each of the numbers before it.
    //Factorials are denoted by the exclamation point (n!). Ex:
    //
    //
    //1! = 1               = 1
    //2! = 1 x 2           = 2
    //3! = 1 x 2 x 3       = 6
    //4! = 1 x 2 x 3 x 4   = 24

    public static void getFactorial() {
        Scanner scanner = new Scanner(System.in);
        String isContinue;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            int userInput = scanner.nextInt();

            while (userInput < 1 || userInput > 10) {
                System.out.println("The number you entered was not between 1 and 10. Please try again.");
                System.out.print("Enter a number between 1 and 10: ");
                userInput = scanner.nextInt();
            }

            long factorial = 1;
            String middle = "1";
            for (int i = 1; i <= userInput; i++) {
                middle += " x " + i;
                factorial *= i;
                System.out.printf("%2d! = %-45s = %d%n", i, middle, factorial);
            }

            System.out.println("Would you like to continue?(y/n)");
            scanner.nextLine();
            isContinue = scanner.nextLine();

        }while (isContinue.equalsIgnoreCase("y"));

        scanner.close();
    }

    // Bonus
    //
    //Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
    //Use recursion to implement the factorial.
    public static int calculateFactorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * calculateFactorial(num - 1);
        }
    }
    public static void getFactorialRecursion() {
        boolean isContinue;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a number between 1 and 12: ");
            int userInput = scanner.nextInt();

            while (userInput < 1 || userInput > 12) {
                System.out.println("The number you entered was not between 1 and 10. Please try again.");
                System.out.print("Enter a number between 1 and 12: ");
                userInput = scanner.nextInt();
            }

            long factorial = 1;
            String middle = "1";
            for (int i = 1; i <= userInput; i++) {
                middle += " x " + i;
                factorial = calculateFactorial(i);
                System.out.printf("%2d! = %-55s = %d%n", i, middle, factorial);
            }

            System.out.println("Would you like to continue?(y/n)");
            scanner.nextLine();
            isContinue = scanner.nextLine().equalsIgnoreCase("y");

        } while (isContinue);

        scanner.close();
    }

    // 4. Create an application that simulates dice rolling.
    //
    //Ask the user to enter the number of sides for a pair of dice.
    //Prompt the user to roll the dice.
    //"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
    //Use static methods to implement the method(s) that generate the random numbers.
    //Use the .random method of the java.lang.Math class to generate random numbers.

    public static void rollDice() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides are there on each of your dice?");
        int numOfSides = scanner.nextInt();
        boolean isRoll;

        // int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        do {
            System.out.println("Please roll the dice.");
            TimeUnit.SECONDS.sleep(1);
            int dice1 = (int) (Math.random() * numOfSides + 1);
            int dice2 = (int) (Math.random() * numOfSides + 1);
            System.out.printf("You rolled number %d and %d%n", dice1, dice2);
            System.out.println("Would you like to roll the dices? (y/n)");
            isRoll = scanner.next().equalsIgnoreCase("y");
        } while (isRoll);

        scanner.close();
    }


    public static void main(String[] args) throws InterruptedException {
//        System.out.println("23 + 32 = " + add(23, 32));
//        System.out.println("23 - 32 = " + minus(23, 32));
//        System.out.println("23 * 32 = " + multiply(23, 32));
//        System.out.println("23 * 32 = " + loopMultiply(23, 32));
//        System.out.println("23 * 32 = " + multiplyRecursion(23, 32));
//        System.out.println("23 / 32 = " + divide(23, 32));
//        System.out.println("23 % 32 = " + modulus(23, 32));

//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);

//        getFactorial();
//        getFactorialRecursion();

        rollDice();
    }


}
