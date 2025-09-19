public class Pascals_triangle {
    public static void main(String[] args) {
        int rows = 6; // number of rows

        for (int n = 0; n < rows; n++) {
            // spacing for triangle shape
            for (int space = 0; space < rows - n; space++) {
                System.out.print(" ");
            }

            int val = 1; // first value of every row is 1
            for (int r = 0; r <= n; r++) {
                System.out.print(val + " ");
                // compute next value using formula
                val = val * (n - r) / (r + 1);
            }

            // also show sum using bit manipulation
            System.out.print(" | sum = " + (1 << n));
            System.out.println();
        }
    }
}
