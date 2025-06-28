import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Basic Calculator ===");
        System.out.print("Do you want to start calculation? (y/n): ");
        char choice = scanner.next().toLowerCase().charAt(0);
        while (choice == 'y') {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = divide(num1, num2);
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator.");
            }


            System.out.print("Do you want to perform another calculation? (y/n): ");
            choice = scanner.next().toLowerCase().charAt(0);
        }

        System.out.println("Calculator closed.");
        scanner.close();
    }


    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}

