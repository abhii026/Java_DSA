// Write a program to print whether a number is even or odd, also take input from the user.
// package assignment1;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        if (num%2==0) {
            System.out.println("Even number ");
        }
        else{
            System.out.println("Odd number");
        }
    }
}
