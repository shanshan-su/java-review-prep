import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HighLow {
    // 5. Game Development 101
    //
    //Welcome to the world of game development!
    //
    //You are going to build a high-low guessing game. Create a class named HighLow inside of src.
    //
    //The specs for the game are:
    //
    //Game picks a random number between 1 and 100.
    //Prompts user to guess the number.
    //All user inputs are validated.
    //If user's guess is less than the number, it outputs "HIGHER".
    //If user's guess is more than the number, it outputs "LOWER".
    //If a user guesses the number, the game should declare "GOOD GUESS!"
    //Hints
    //
    //Use the random method of the java.lang.Math class to generate a random number.

    // Bonus
    //
    //Keep track of how many guesses a user makes.
    //Set an upper limit on the number of guesses.

    public static void playGuessGame() {
        Scanner scanner =  new Scanner(System.in);
        int random = (int) (Math.random() * 100 + 1);

        System.out.println("Howdy there! Welcome to the guess game.");
        System.out.println("I have a number between 1 and 100:)");
        int userNum;
        int guessCount = 0;
        int maxGuess = 7;

        do {
            System.out.println("Please make a guess. Enter a number.");
            userNum = scanner.nextInt();
            guessCount += 1;

            if (userNum < random) {
                System.out.println("HIGHER!");
            } else if (userNum > random) {
                System.out.println("LOWER!");
            }
        } while (userNum != random && guessCount <= maxGuess);

        if (userNum == random && guessCount <= maxGuess) {
            System.out.println("GOOD GUESS!");
        } else {
            System.out.println("I'm sorry you have guessed too many times!");
        }

    }

    public static void main(String[] args) {
        playGuessGame();
    }

}
