package STUDENT_GRAD_CALCULATOR;

import java.util.InputMismatchException;
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
            try {
                System.out.print("Enter your grade of Subject # " + (i + 1) + " : ");
                grade = scanner.nextDouble();

                System.out.println("Your letter grade in Subject # " + (i + 1) + " : " + gradeString(grade) + "\n");
            } catch (InputMismatchException exception) {
                System.out.println(exception);
                scanner.next();
            }

            sum += grade;
        }
        average = sum / numberOfSubjects;

        System.out.println("##### Your Grade Summary #####");
        System.out.printf("The sum = %.2f\n", sum);
        System.out.printf("Your overall average = %.2f\n", average);
        System.out.printf("Your letter grade = %s\n", gradeString(average));

        scanner.close();
    }

    public static String gradeString(double grade) {
        if (grade >= 95) {
            return "A+";
        } else if (grade >= 90) {
            return "A";
        } else if (grade >= 85) {
            return "A-";
        } else if (grade >= 80) {
            return "B+";
        } else if (grade >= 75) {
            return "B";
        } else if (grade >= 70) {
            return "B-";
        } else if (grade >= 65) {
            return "C+";
        } else if (grade >= 60) {
            return "C";
        } else if (grade >= 56) {
            return "C-";
        } else if (grade >= 53) {
            return "D+";
        } else if (grade >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
