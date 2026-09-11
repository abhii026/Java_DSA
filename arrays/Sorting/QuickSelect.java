import java.util.*;

public class QuickSelect {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements in array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter k the position: ");
        int k = in.nextInt();

        int ans = quicksel(arr, 0, n - 1, k);

        System.out.println("Kth smallest element = " + ans);
    }


    static int pivot(int[] arr, int low, int high) {

        int p = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= p) {

                i++;

                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return i + 1;
    }


    static int quicksel(int[] arr, int low, int high, int k) {

        int pi = pivot(arr, low, high);

        int target = k - 1;

        if (pi == target) {
            return arr[pi];
        }

        else if (target < pi) {
            return quicksel(arr, low, pi - 1, k);
        }

        else {
            return quicksel(arr, pi + 1, high, k);
        }
    }


    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}