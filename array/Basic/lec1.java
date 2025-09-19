
import java.util.Arrays;
import java.util.Scanner;

public class lec1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter size of arr: ");
        int size=in.nextInt();
        int[] arr=new int[size];
        // arr[0]=2;
        // arr[1]=9;
        // arr[2]=8;
        // arr[3]=6;
        // arr[4]=5;

        System.out.print("Enter elements in arr: ");
        
        // User input using for loop.
        for(int i=0; i<arr.length; i++){
            arr[i]=in.nextInt();
        }
        // System.out.print("Entered elements in arr are: ");
        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i] + " ");
        // }
        System.out.println(Arrays.toString(arr)); // Another method to print the elements if array.
    }
}
