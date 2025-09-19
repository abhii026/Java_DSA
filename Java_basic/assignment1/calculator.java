// package assignment1;
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)


import java.util.Scanner;;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();

        System.out.print("Enter Operator(+,-,*,/): ");
        char operator=input.next().charAt(0);

        if (operator=='+') {
            int sum = num1+num2;
            System.out.println("Sum of "+ num1 + " + " + num2 + " is: "+sum);
        }
        else if (operator=='-') {
            int difference = num1- num2;
            System.out.println("Difference of "+num1+ " - " +num2+ " is: "+difference);
        }
        else if (operator=='*') {
            int multiply = num1*num2;
            System.out.println("Product of "+num1+ " * " +num2+ " is: "+multiply);
        }
        else if (operator=='/') {
            if (num2!=0) {
                int divide = num1/num2;
                System.out.println("Divide of "+num1+ " / " +num2+ " is: "+divide);
            }
            else{
                System.out.println("Not divided by zero ,Thankyou!");
            }
        }
        else{
            System.out.println("Select right operator.");
        }
    }
}
