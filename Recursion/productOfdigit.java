public class productOfdigit {
    public static void main(String[] args) {
        int n=153;
        int ans=Prod(n);
        System.out.println(ans);
    }
    static int Prod(int n){
        if(n<1){
            return 1;
        }
        return Prod(n/10)*(n%10);
    }
}
