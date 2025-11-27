
public class sumOfn {

    public static void main(String[] args) {
        int n = 1;
        int res = Sum(n);
        System.out.println(res);
    }

    static int Sum(int n) {
        if (n <1) {
            return 0;
        }
        return n + Sum(n - 1);
    }
}
