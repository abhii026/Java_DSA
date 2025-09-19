import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        boolean ans = isprime(n);
        System.out.println(ans);

    }

    static boolean isprime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
