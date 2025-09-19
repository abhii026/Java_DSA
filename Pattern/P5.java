// package Pattern;

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

import java.util.regex.Pattern;

public class P5 {
    public static void main(String[] args) {
        Pattern5(5);
    }

    static void Pattern5(int n){
        for (int i = 0; i < 2*n; i++) {
            int TotalCol= i > n? 2*n-i : i;
            for (int j = 0; j < TotalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
