import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(Isodd(num));

    }
    static boolean Isodd(int n){
        return ((n&1)==1);
    }
}
