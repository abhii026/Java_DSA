

// To find Armstrong Number between two given number.


import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        input.close();
        int temp = num, digits = 0, sum = 0, originalnum = num;
        while (temp>0) {
            temp=temp/10;
            digits++;
        }
        temp =num;
        while (temp>0) {
            int rem = temp%10;
            sum+=Math.pow(rem, digits);
            temp=temp/10;
        }
        if (originalnum==sum) {
            System.out.println(originalnum+ " is Armstrong Number");
        }
        else{
            System.out.println(originalnum+ " is not Armstrong Number");
        }

    }
}
