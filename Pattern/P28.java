// package Pattern;

    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
        //  *

public class P28 {
    public static void main(String[] args) {
        Pattern28(5);
    }
    static void Pattern28(int n){
        for (int i = 0; i < 2*n; i++) {
            int TotalCol= i > n? 2*n-i : i;
            int no_spaces=n-TotalCol;
            for (int k = 0; k < no_spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < TotalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
