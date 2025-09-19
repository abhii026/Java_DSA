public class gcd {
    public static void main(String[] args) {
        int a=10;
        int b=6;
        System.out.print(Gcd(a, b));
    }
    static int Gcd(int a,int b){
        if(b==0){
            return a;
        }
        return Gcd(b,a%b);
    }
}
