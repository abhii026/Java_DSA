// package Maths;
public class clear_bit {
    public static void main(String[] args) {
        int n=10;
        int i=3;
        System.out.println(Clear_Bit(n,i));
    }
    static int Clear_Bit(int n,int i){
        if(n==0){
            return n;
        }
        return n&~(1<<i);
    }
}
