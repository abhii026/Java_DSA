// package Sorting.CyclicSort;

import java.util.Arrays;
import java.util.Scanner;


public class CyclicSort {
    public static void main(String[] args) {
        // Scanner in= new Scanner(System.in);
        // System.out.print("Enter the size of array: ");
        // int size=in.nextInt();
        // int[] arr=new int[size];
        // System.out.print("Enter elements in array: ");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=in.nextInt();
        // }
        int[] arr={3,5,2,1,4};
        sort(arr);
        System.out.print(Arrays.toString(arr));

    }

    static void sort(int[] arr){
        int i=0;
        while (i<arr.length) {
            int correct=arr[i]-1;
            if (arr[i]!=arr[correct]) {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int i, int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }
}
