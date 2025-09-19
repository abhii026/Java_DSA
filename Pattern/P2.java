// package Pattern;


// 2.  *
//     **
//     ***
//     ****
//     *****

import java.util.regex.Pattern;

public class P2 {
    public static void main(String[] args) {
        Pattern2(5);
    }
    static void Pattern2(int n){
        for (int row = 1; row<=n; row++) {
            for(int column=1; column<=row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
