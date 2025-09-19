public class PowerofTwo {
    public static void main(String[] args) {
        int n=31;
        boolean ans =(n&(n-1))==0;
        System.out.println(ans);
    }
}
