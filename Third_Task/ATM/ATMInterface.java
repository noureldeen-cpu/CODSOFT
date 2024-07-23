package ATM;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ATMInterface {
    private static int choose;
    private static double amount;

    public static void start() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Our ATM!");

        Account account = new Account(5000, 123); // these numbers are used for testing the application

        ATM: {
            do {
                options();
                try {
                    System.out.print("\nChoose the operation: ");
                    choose = input.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                    input.next(); // to clear invalid input
                }

                System.out.println();

                switch (choose) {
                    case 1:
                        try {
                            double balance = account.getBalance();
                            do {
                                System.out.print("Enter money to be withdrawn: ");
                                amount = input.nextDouble();

                                System.out.println();

                                if (amount > balance) {
                                    System.out.println("The money you want is not exist.");
                                }
                                
                            } while (amount > balance);

                        } catch (InputMismatchException e) {
                            System.out.println(e + "\n");
                            input.next();
                        }
                        account.withdraw(amount);
                        break;
                    case 2:
                        try {
                            System.out.print("Enter money to be deposited: ");
                            amount = input.nextDouble();
                        } catch (InputMismatchException e) {
                            System.out.println(e);
                            input.next();
                        }

                        account.deposit(amount);
                        break;
                    case 3:
                        account.checkBalance();
                        break;
                    case 4:
                        System.out.println("^_^ Thanks for using our services ^_^");
                        break ATM;
                    default:
                        System.out.println("This operation not existing!\n");
                }
            } while (choose != 4);
        }
        input.close();
    }

    private static void options() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("#### Operatoins #####");
        System.out.println("Enter 1 for Withdraw.");
        System.out.println("Enter 2 for Deposit.");
        System.out.println("Enter 3 for Check Balance.");
        System.out.println("Enter 4 for EXIT.");
        System.out.println("----------------------------------------------------------------");
    }
}
