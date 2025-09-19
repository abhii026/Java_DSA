import java.util.Scanner;

public class Arm { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        input.close();  // Close scanner to prevent memory leak

        int temp = num, digits = 0, sum = 0, originalnum = num;

        // Count the number of digits
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        // Calculate the sum of digits raised to the power of 'digits'
        temp = num; // Reset temp to original num
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp = temp / 10;
        }

        // Check if the number is Armstrong
        if (originalnum == sum) {
            System.out.println(originalnum + " is an Armstrong Number");
        } else {
            System.out.println(originalnum + " is not an Armstrong Number");
        }
    }
}
