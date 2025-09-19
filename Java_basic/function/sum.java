// package function;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        int result = sumnum(num1, num2);
        System.out.println("Sum: " + result);
        
    }

    static int sumnum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
