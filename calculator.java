import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first number (Enter -1 to exit):");
            double num1 = scanner.nextDouble();

            if (num1 == -1) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }
            System.out.println("Enter an operator (+, -, *, /):");
            char operator = scanner.next().charAt(0);

            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                case '^':
                    result = Math.pow(num1, num2);
                    break;

                default:
                    System.out.println("Invalid operator!");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
