import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            
            System.out.print("Choose operation (+, -, *, /): ");
            char op = sc.next().charAt(0);
            
            double result;
            
            switch(op) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                }
                case '/' -> {
                    if(num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                }
                default -> System.out.println("Invalid operation.");
            }
        }
    }
}
