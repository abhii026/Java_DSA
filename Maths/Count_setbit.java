public class Count_setbit {
    public static void main(String[] args) {
        int n=15;
        System.out.println(Integer.toBinaryString(n));
        // int count=0;
        // while(n>0){
        //     if((n&1)==1){
        //         count++;
        //     }
        //     n=n>>1;
        // }
        // System.out.println(count);
        System.out.println(setbit(n));
    }
    static int setbit(int n){
        int co=0;
        while(n>0){
            co++;
            n=n&(n-1);
        }
        return co;
    }
}
