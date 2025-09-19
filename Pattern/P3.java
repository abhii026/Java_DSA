// package Pattern;

import java.util.regex.Pattern;

// *****
// ****
// ***
// **
// *
public class P3 {
    public static void main(String[] args) {
        Pattern3(5);
    }

    static void Pattern3(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
