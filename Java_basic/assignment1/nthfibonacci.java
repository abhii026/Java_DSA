import java.util.Scanner;;
public class nthfibonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter nth term: ");
        int n=input.nextInt();
        int first=0;
        int next=1;
        int count=2;
        while (count<=n) {
            int temp=next;
            next=next+first;
            first=temp;
            count++;
        }
        System.out.println(first);
    }
}
