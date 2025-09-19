// To find out whether the given String is Palindrome or not

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        int originalnum = n;
        int reversednum = 0;
        while (n>0) {
            int rem=n%10;
            reversednum= reversednum*10+rem;
            n=n/10;
        }
        if(originalnum==reversednum){
            System.out.println(+originalnum + " is Palindrome number.");
        }
        else{
            System.out.println(+ originalnum + " is not Palindrome number. ");
        }
    }
}
