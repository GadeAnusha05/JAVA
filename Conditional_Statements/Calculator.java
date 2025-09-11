import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0); // Reads a single character

        if (op == '+') {
            System.out.println("Result: " + (a + b));
        } else if (op == '-') {
            System.out.println("Result: " + (a - b));
        } else if (op == '*') {
            System.out.println("Result: " + (a * b));
        } else if (op == '/') {
            if (b != 0) {
                System.out.println("Result: " + (a / b));
            } else {
                System.out.println("Error: Division by zero!");
            }
        } else {
            System.out.println("Invalid operator!");
        }

        sc.close();
    }
}
