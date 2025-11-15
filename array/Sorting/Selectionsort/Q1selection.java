// package Sorting.Selectionsort;

import java.util.Arrays;
import java.util.Scanner;

public class Q1selection {
    static int swapCount = 0;
    static int compCount = 0; 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter the size of array: ");
        // int size = in.nextInt();
        // int[] arr = new int[size];
        // System.out.print("Enter the elements: ");
        // for (int i = 0; i < size; i++) {
        //     arr[i] = in.nextInt();
        // }
        // int[] arr = {1,2,3,4,5};
        int[] arr = { 3, 1, 5, 4, 2,0,-4 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Total swaps: " + swapCount);
        System.out.println("Total comparisons: " + compCount);
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int second) {
         if (first != second) { // count swap only if positions are different
            swapCount++;
        }
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        // System.out.println("Swap executed: " + first + " ↔ " + second);
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start+1; i <= end; i++) {
            compCount++;
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
