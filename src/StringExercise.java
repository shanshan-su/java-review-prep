public class StringExercise {
    public static void main(String[] args) {
        // 1. String Basics.
        //
        //Create a class named StringExercise with a main method.
        //
        //For each of the following output examples: create a String variable that contains the desired output and print it out to the console, you can do this with only one String variable and one print statement for each output example.
        //
        //Copied to clipboard
        //We don't need no education
        //We don't need no thought control
        //Copied to clipboard
        //Check "this" out!, "s inside of "s!
        //Copied to clipboard
        //In windows, the main drive is usually C:\
        //Copied to clipboard
        //I can do backslashes \, double backslashes \\,
        //and the amazing triple backslash \\\!

        String myString;

        myString = "We don't need no education\n" +
                "We don't need no thought control";
        System.out.println(myString + "\n");

        myString = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(myString + "\n");

        myString = "In windows, the main drive is usually C:\\";
        System.out.println(myString + "\n");

        myString = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(myString + "\n");
    }
}
