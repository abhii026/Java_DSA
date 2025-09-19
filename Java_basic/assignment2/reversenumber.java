import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        int reversednum = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            reversednum = reversednum * 10 + lastdigit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversednum);
    }
}
