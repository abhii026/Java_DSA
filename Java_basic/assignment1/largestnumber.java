// package assignment1;

// Take 2 numbers as input and print the largest number

import java.util.Scanner;;

public class largestnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        if (num1 > num2) {
            System.out.println("Largest is num1: " + num1);
        } else {
            System.out.println("Largest is num2: " + num2);
        }
    }
}
