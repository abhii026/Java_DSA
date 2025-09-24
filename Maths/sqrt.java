import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int p = 3;
        double res = sqrt(num, p);
        System.out.printf("%.3f", res);
    }

    static double sqrt(int num, int p) {
        int start = 0;
        int end = num;
        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) {
                root=mid;
                return mid;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= num) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;
    }
}
