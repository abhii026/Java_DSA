// package Pattern;

    //         1
    //       2 1 2
    //     3 2 1 2 3
    //   4 3 2 1 2 3 4
    // 5 4 3 2 1 2 3 4 5

import java.util.regex.Pattern;

public class P30 {
    public static void main(String[] args) {
        Pattern30(5);
    }
    static void Pattern30(int n){
        for(int row=1; row<=n; row++){
            for(int s=0; s<=n-row-1; s++){
                System.out.print("  ");
            }
            for (int j = row; j>=1 ; j--) {
                System.out.print(j+" ");
            }
            for(int k=2; k<=row; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
