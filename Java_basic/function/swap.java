import java.util.Scanner;

public class swap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        int[] res= swapnum(a,b);
        System.out.println("The swapped numbers are: " + res[0] + " and " + res[1]);

    }

    static int[] swapnum(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        return new int[]{x, y}; 
    }
}