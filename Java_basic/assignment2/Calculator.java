
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.print("Enter Operator: ");
            char Operator = in.next().trim().charAt(0);
            
            // Exit condition should be checked first
            if (Operator == 'X' || Operator == 'x') {
                break;
            }
            
            if (Operator == '+' || Operator == '-' || Operator == '*' || Operator == '/' || Operator == '%') {
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (Operator == '+') {
                    result = num1 + num2;
                } else if (Operator == '-') {
                    result = num1 - num2;
                } else if (Operator == '*') {
                    result = num1 * num2;
                } else if (Operator == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero!");
                        continue; // Skip to the next iteration
                    }
                } else if (Operator == '%') {
                    result = num1 % num2;
                }
                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid Operator. Try Again.");
            }
        }
        in.close(); // Close Scanner to prevent resource leaks
    }
}
