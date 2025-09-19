// package Pattern;

// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

public class P4 {
    public static void main(String[] args) {
        Pattern4(5);
    }

    static void Pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print( j+" ");
            }
            System.out.println();
        }
    }
}
