
//Bubble sort and Binary Search Algorthim on 1D- Array.

import java.util.Arrays;
import java.util.Scanner;

public class search_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // size of array
        System.out.print("Enter size of array: ");
        int size = in.nextInt();

        // Array declarization
        int[] arr = new int[size];
        // Array input using for loop
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        // Calling bubble sort .
        int[] new_arr = sorting(arr);
        // printing sorted array.
        System.out.println("Sorted array is: " + Arrays.toString(new_arr));

        // Taking Input of target value to search in array.
        System.out.print("Enter target value: ");
        int target = in.nextInt();
        // Calling Binary search .
        int result = search(new_arr, target);
        // Checking target element found or not.
        if (result == -1) {
            System.out.println("Target value is !! Not Found !!: ");
        } else {
            System.out.println("Target value at index: " + result);
        }
    }

    // BUBBLE SORT.
    static int[] sorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // BINARY SEARCH.
    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}