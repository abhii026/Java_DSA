// package Sorting.Insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class insertionsort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        // int[] arr2={2,1};
        InsertionSort(arr);
        System.out.print("Sorted Array: ");
        System.out.print(Arrays.toString(arr));
    }

    static void InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j]<arr[j-1]) {
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
