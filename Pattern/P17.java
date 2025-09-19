// package Pattern;

//      1
//     212
//    32123
//   4321234
//    32123
//     212
//      1

public class P17 {
    public static void main(String[] args) {
        Pattern17(6);
    }

    static void Pattern17(int n) {
        for (int row = 1; row < 2 * n; row++) {
            int TotalCol = row > n ? 2 * n - row : row;
            int no_spaces = n - TotalCol;
            for (int sp = 1; sp <= no_spaces; sp++) {
                System.out.print("  ");
            }
            for (int j = TotalCol; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int k = 2; k <= TotalCol; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
