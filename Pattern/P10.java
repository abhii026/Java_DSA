// package Pattern;

//      *
//     * *
//    * * *
//   * * * *
//  * * * * *

import java.util.regex.Pattern;

public class P10 {
    public static void main(String[] args) {
        Pattern10(5);
    }

    static void Pattern10(int n) {
        for (int i = 0; i < n; i++) {
            int no_spaces = n - i - 1;
            for (int j = 0; j < no_spaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
