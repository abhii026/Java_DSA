// package Pattern;

//  4 4 4 4 4 4 4
//  4 3 3 3 3 3 4
//  4 3 2 2 2 3 4
//  4 3 2 1 2 3 4
//  4 3 2 2 2 3 4
//  4 3 3 3 3 3 4
//  4 4 4 4 4 4 4
public class P31 {
    public static void main(String[] args) {
        Pattern31(4);
    }

    static void Pattern31(int n) {
        int original = n;
        n = n * 2 - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = original - Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
