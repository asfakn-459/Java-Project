import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.err.println("Welcome to My Calculator");
            System.err.println("     ***********        ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    System.out.println("Thank you for using me >>>>");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }

        } while (choice != 5);

        scanner.close();
    }

    private static void performAddition() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second value: ");
        int num2 = scanner.nextInt();

        int result = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
    }

    private static void performSubtraction() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second value: ");
        int num2 = scanner.nextInt();

        int result = num1 - num2;
        System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + result);
    }

    private static void performMultiplication() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first value: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second value: ");
        int num2 = scanner.nextInt();

        int result = num1 * num2;
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + result);
    }

    private static void performDivision() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        if (denominator != 0) {
            double result = (double) numerator / denominator;
            System.out.println("The division of " + numerator + " and " + denominator + " is " + result);
        } else {
            System.out.println("Cannot divide by zero. Please enter a non-zero denominator.");
        }
    }
}

