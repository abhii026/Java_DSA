import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        System.out.print("Enter digit: ");
        int digit = in.nextInt();
        int count = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            if (lastdigit == digit) {
                count++;
            }
            num /= 10;
        }
        System.out.println(count);
    }
}
