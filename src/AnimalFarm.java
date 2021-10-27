import java.util.Scanner;

public class AnimalFarm {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you have a doggo? (y/n)");
        String input = scanner.next();

        if (input.equals("y")){
            System.out.println("Awesome! What is their name?");
            input = scanner.next();
            System.out.printf("%s is such a great name! Have any other dogs? (y/n)", input);
            input = scanner.next();
            if (input.equals("y")){
                System.out.println("How many dogs??");
                int doggoCount = scanner.nextInt();
                if (doggoCount < 3){
                    System.out.println("That sounds like just the right amount for a peaceful house!");
                }else if (doggoCount > 3 && doggoCount < 6){
                    System.out.printf("I bet you stay busy with %s dogs!", doggoCount);
                }else{
                    System.out.println("OMG you have a farm! How do you manage them??");
                }
            }
        }else{
            System.out.println("Ok! How about a kitty? (y/n)");
            input = scanner.next();
            if (input.equals("y")){
                System.out.println("Awesome! What is their name?");
                input = scanner.next();
                System.out.printf("%s is such a great name! Have any other cats? (y/n)", input);
                input = scanner.next();
                if (input.equals("y")){
                    System.out.println("How many cats??");
                    int kittyCount = scanner.nextInt();
                    if (kittyCount < 3){
                        System.out.println("That sounds like just the right amount for a peaceful house!");
                    }else if (kittyCount > 3 && kittyCount < 6){
                        System.out.printf("I bet you stay busy with %s cats!", kittyCount);
                    }else{
                        System.out.println("OMG you have a farm! How do you manage them??");
                    }
                }
            }else {
                System.out.println("Hmm... no dogs or cats. Any other animals? (y/n)");
                input = scanner.next();
                if (input.equals("y")){
                    System.out.println("Awesome! What is their name?");
                    input = scanner.next();
                    System.out.printf("%s is such a great name! Have any other animals? (y/n)", input);
                    input = scanner.next();
                    if (input.equals("y")){
                        System.out.println("How many animals??");
                        int animalCount = scanner.nextInt();
                        if (animalCount < 3){
                            System.out.println("That sounds like just the right amount for a peaceful house!");
                        }else if (animalCount > 3 && animalCount < 6){
                            System.out.printf("I bet you stay busy with %s animals!", animalCount);
                        }else{
                            System.out.println("OMG you have a farm! How do you manage them??");
                        }
                    }
                }
            }
        }
    }
}
