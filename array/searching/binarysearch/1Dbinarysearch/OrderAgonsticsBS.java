// package searching.binarysearch;

import java.lang.annotation.Target;
import java.util.Scanner;

public class OrderAgonsticsBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr1 = new int[size];
        System.out.print("Enter elements in array: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.print("Enter target value: ");
        int target = in.nextInt();

        int result = orderAgonsticsBS(arr1, target);

        if (result == -1) {
            System.out.print("Target value is not found in the array.");
        }
        else {

            System.out.print("Target value is found at the index: " + result);
        }
        
    }

    static int orderAgonsticsBS(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (isAsc) {
                if (value < arr[mid]) {
                    end = mid - 1;
                } else if (value > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (value < arr[mid]) {
                    start = mid + 1;
                } else if (value > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
