
public class factorial {

    public static void main(String[] args) {
        int n = 5;
        int res = fact(n);
        System.out.println("Factorial of " + n + " is: " + res);
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
