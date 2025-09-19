
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class two_d_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int row_size = in.nextInt();
        System.out.print("Enter column size: ");
        int column_size = in.nextInt();
        int[][] arr = new int[row_size][column_size];
        System.out.print("Enter element in 2D array: ");
        for (int row = 0; row < row_size; row++) {
            for (int column = 0; column < column_size; column++) {
                arr[row][column] = in.nextInt();
            }
        }
        System.out.println("Print elements:");
        for (int row = 0; row < row_size; row++) {
            for (int column = 0; column < column_size; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println( );
        }

        // Another method to print is;
        for(int i=0;i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        //Enhanced for loop is=
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
