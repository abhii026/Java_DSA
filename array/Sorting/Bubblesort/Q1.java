// package Sorting.Bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int size = in.nextInt();
        // int[] arr = new int[size];
        // System.out.print("Enter the elements: ");
        // for (int i = 0; i < size; i++) {
        //     arr[i] = in.nextInt();
        // }
        int[] arr2 = {1, 2, -3, 4, 5, 0};
        bubblesort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void bubblesort(int[] arr) {
        // RUN THE STEPS N-1 TIMES
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            // FOR EACH STEP, MAX ITEM WILL COME AT THE LAST RESPECTIVE INDEX.
            for (int j = 1; j <= arr.length - i - 1; j++) {
                // SWAP IF THE ITEM IS SMALLER THAN THE PREVIOUS ITEM.
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
