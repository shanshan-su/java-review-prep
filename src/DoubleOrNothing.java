import java.util.Scanner;

public class DoubleOrNothing {
    public static void main(String[] args) {


        // This is a game where the user picks an initial number, and the opposing "user" doubles that number.
        // Then, the user should double THAT number. This goes on until someone guesses incorrectly or gives up!

        // We have a problem here. The user should double the previous number
        // With our current program flow and layout, that would be VERY tedious.

        // But there is a way we could break this code apart into separate pieces of functionality,
        // calling those pieces when we need them.

        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;
        int number = 0;

        System.out.println("Let's play a game. You say a number and I'll repeat that number doubled.");
        System.out.println("Then, you have to repeat that doubled number back, doubled on itself!\n");
        System.out.println("Go ahead and pick a number: ");


        while (shouldContinue){


            // Maybe, some of those methods could return data values like an int
            int userInput = scanner.nextInt();

            // Perhaps some will just execute code and not return a value (void)
            if ((number != 0) && (userInput != number * 2)){
                System.out.println("Oof your lose!");
                return;
            }

            System.out.println("...");
            System.out.println(".....");
            number = userInput * 2;

            // Some others could take in an int as an argument and return a value like a boolean
            System.out.printf("The double number is %s", number);
            System.out.println("-------------------------------\n");
            System.out.println("Want to continue? (y/n)");
            shouldContinue = scanner.next().equalsIgnoreCase("y");
        }
        System.out.println("**********************");
        System.out.println("Ok, see ya!");

    }
}
