import java.util.Scanner;
public class typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TYPE CASTING
        int num = (int)(4522.430f);// type casting of float value to integer.
        System.out.println(num);

        // AUTOMATIC TYPE PROMOTION IN EXPRESSIONS.

        int a= 257;
        byte b=(byte)(a);
        System.out.println(b);// 257 % 256 = 1
    }
}
