public class factors {
    public static void main(String[] args) {

        int num = 20;
        factor(num);
        // System.out.println();
    }

    static void factor(int n) {

        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
            // System.out.print(" ");
        }
    }
}
