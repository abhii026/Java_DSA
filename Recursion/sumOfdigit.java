public class sumOfdigit {
    public static void main(String[] args) {
        int n=1342;
        int ans=SUM(n);
        System.out.println(ans);
    }
    static int SUM(int n){
        if(n<1){
            return 0;
        }
        return SUM(n/10)+(n%10);
    }
}
