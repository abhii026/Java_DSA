
// package assignment1;
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle value: ");
        float principal = in.nextFloat();
        System.out.print("Enter Rate: ");
        float rate = in.nextFloat();
        System.out.print("Enter Time(yearly): ");
        int time = in.nextInt();
        float simpleinterest = (principal * rate * time) / 100;
        System.out.println("Simple Interst is: " + simpleinterest);
    }
}
