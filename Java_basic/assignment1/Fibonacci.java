


// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;;
public class Fibonacci  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of terms: ");
        int n = input.nextInt();
        if (n<=0) {
            System.out.println("Please enter positive number");
        }
        else{
            int first=0,second=1,next;
            System.out.print("Fibonacci Series: ");
            for(int i=1; i<=n; i++){
                System.out.print(+first+" ");
                next=first+second;
                first=second;
                second=next;
            }
        }
    }
}
