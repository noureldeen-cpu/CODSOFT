import java.util.Scanner;

public class Start {

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int random = 0;
        int userInput = 0;
        int rounds = 1;
        int score = 0;
        String check = "";
        boolean bool = false;
        do {
            random = (int) (Math.random() * 100) + 1;

            System.out.println("##### Ronund Number: " + rounds + " #####\n");

            for (int i = 5; i > 0; i--) {
                    System.out.print("Enter the guess number between (1:100) : ");
                    userInput = scanner.nextInt();
                
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

            while (!(check.equalsIgnoreCase("YES") || check.equalsIgnoreCase("Y") || check.equalsIgnoreCase("NO")
                    || check.equalsIgnoreCase("N"))) {
                System.out.println("##### Do you want to play again? (Yes/No) #####");
                check = scanner.nextLine();

                if (!check.equalsIgnoreCase("YES") && !check.equalsIgnoreCase("Y")
                        && !check.equalsIgnoreCase("NO") && !check.equalsIgnoreCase("N")) {
                    System.out.println("Invalid input\n");
                }

                if (check.equalsIgnoreCase("YES") || check.equalsIgnoreCase("Y")) {
                    bool = true;
                } else if (check.equalsIgnoreCase("NO") || check.equalsIgnoreCase("N")) {
                    bool = false;
                }
            }
            rounds++;
        } while (bool);

        System.out.println("\n##### Your Final Score: " + score + " #####\n");

        System.out.println("\nThanks for playing!");
        System.out.println("Have a nice day.");

        scanner.close();
    }

}