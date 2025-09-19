// package 2dbinarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // System.out.print("Enter row size of the marix: ");
        // int row=in.nextInt();
        // System.out.print("Enter column size of the marix: ");
        // int column=in.nextInt();
        // int[][] matrix=new int[row][column];
        // for (int i = 0; i < row; i++) {
        //     System.out.println("Enter element in "+i);
        //     for (int j = 0; j < column; j++) {
        //         System.out.print("Enter "+j+" elements: ");
        //         matrix[i][j]=in.nextInt();
        //     }
        // }
        // System.out.print("Enter key: ");
        // int key=in.nextInt();
        int[][] matrix={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49}
            // {33,34,38,50}
        };
        int key=35;
        System.out.println(Arrays.toString(search(matrix,key)));
        

    }

    static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr[0].length - 1;
        while (r < arr.length && c >= 0) {
            if (target == arr[r][c]) {
                return new int[] { r, c };
            }
            if (target > arr[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}
