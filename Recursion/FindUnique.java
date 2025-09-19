import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        // Scanner in =new Scanner(System.in);
        // int num=in.nextInt();
        int[] num = { 2, 3, 4, 3, 2, 6, 4 };
        System.out.print("Unique number is:");
        System.out.println(unique(num));

    }

    static int unique(int[] arr) {
        int un = 0;
        for (int n : arr) {
            un ^= n;
        }
        return un;
    }
}
