import java.util.Scanner;

public class NewtonSqrt {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();
        System.out.print(sqrt(num));
    }
    static double sqrt(int n){
        double x=n;
        double root;
        while(true){
            root=0.5*(x+n/x);
            if(Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        return root;
    }
}
