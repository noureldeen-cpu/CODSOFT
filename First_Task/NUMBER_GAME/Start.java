package NUMBER_GAME;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Start {

    public static void start() {
        Scanner scanner = new Scanner(System.in);

        int random = 0;
        int userInput = 0;
        int rounds = 1;
        int score = 0;
        String userCheck = null;
        boolean booleanCheck = false;

        do {
            random = generanteRandom() ;

            System.out.println("##### Ronund Number: " + rounds + " #####\n");
            System.out.println("##### You have just FIVE tries in the round #####");

            for (int i = 5; i > 0; i--) {

                try {
                    while (userInput < 0 || userInput > 100) {
                        System.out.print("Enter the guess number between (1:100) : ");
                        userInput = scanner.nextInt();
                    }
                } catch (InputMismatchException exception) {
                    System.out.println(exception.getMessage());
                    scanner.next(); // Clear the invalid input
                }

                if (userInput == random) {
                    System.out.println("Congratulations! You've guessed the number correctly.\n");

                    score++;
                    System.out.println("##### Your Score: " + score + " #####\n");

                    break;
                } else if (userInput < random) {
                    System.out.println("Too low. Try again.\n");
                } else if (userInput > random) {
                    System.out.println("Too high. Try again.\n");
                }

                String message = (i != 1) ? "You have " + (i - 1) + " tries left.\n"
                        : "Sorry, you've run out of attempts.\nGame over!!!\n";

                System.out.println(message);
            }

            scanner.nextLine();

            while (!(userCheck.equalsIgnoreCase("YES") || userCheck.equalsIgnoreCase("Y")
                    || userCheck.equalsIgnoreCase("NO")
                    || userCheck.equalsIgnoreCase("N"))) {
                try {
                    System.out.println("##### Do you want to play again? (Yes/No) #####");
                    userCheck = scanner.nextLine();
                } catch (InputMismatchException exception) {
                    System.out.println(exception.getMessage());
                    scanner.next(); // Clear the invalid input
                }

                if (!userCheck.equalsIgnoreCase("YES") && !userCheck.equalsIgnoreCase("Y")
                        && !userCheck.equalsIgnoreCase("NO") && !userCheck.equalsIgnoreCase("N")) {
                    System.out.println("Invalid input\n");
                }

                if (userCheck.equalsIgnoreCase("YES") || userCheck.equalsIgnoreCase("Y")) {
                    booleanCheck = true;
                } else if (userCheck.equalsIgnoreCase("NO") || userCheck.equalsIgnoreCase("N")) {
                    booleanCheck = false;
                }
            }
            rounds++;
        } while (booleanCheck);

        System.out.println("\n##### Your Final Score: " + score + " #####\n");

        System.out.println("\nThanks for playing!");
        System.out.println("Have a nice day.");

        scanner.close();
    }

    public static int generanteRandom() {
        return (int) (Math.random() * 100) + 1;
    }
}