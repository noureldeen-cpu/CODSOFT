package STUDENT_GRAD_CALCULATOR;

import java.util.Scanner;

public class GradCalculator {
    public GradCalculator() {
    }

    public static void Calculator() {
        Scanner scanner = new Scanner(System.in);

        double grade = 0.0;
        int numberOfSubjects = 0;
        double sum = 0.0;
        double average = 0.0;

        System.out.println("##### Welcome to the GradCalculator Application #####\n");

        System.out.print("Enter the number of the subject that you have: ");
        numberOfSubjects = scanner.nextInt();

        System.out.println();

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter your grade of Subject # " + (i + 1) + " : ");
            grade = scanner.nextDouble();

            sum += grade;
        }
        average = sum / numberOfSubjects;

        System.out.println("##### Your Grade Summary #####");
        System.out.printf("The sum = %.2f\n" , sum);
        System.out.printf("Your overall average = %.2f\n",average);

        scanner.close();
    }
}
