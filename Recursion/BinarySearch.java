import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of array: ");
        int size = in.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter elements in array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter target value: ");
        int target = in.nextInt();
        // int[] arr={1,2,3,4,55,66,77};
        System.out.print(Search(arr, target, 0, arr.length - 1));

    }

    static int Search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return 1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return Search(arr, target, start, mid - 1);
        }
        return Search(arr, target, mid + 1, end);
    }
}
