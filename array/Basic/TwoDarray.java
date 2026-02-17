
import java.util.Arrays;

public class TwoDarray {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println("Before swaping: ");
        for(int r = 0; r < arr.length; r++) {
            System.out.println(Arrays.toString(arr[r]));
        }
        int row = arr.length;
        int col = arr[0].length;
        System.out.print(row);
        int i = 0, left = 0;
        int right = col - 1;
        while (i < row && left < right) {
            swap(arr, left, right, i);
            left++;
            right--;
            if (left >= right) {
                i++;
                left = 0;
                right = col - 1;
            }
        }
        System.out.println("After swaping: ");
        for (int r = 0; r < arr.length; r++) {
            System.out.println(Arrays.toString(arr[r]));
        }
    }

    static void swap(int[][] arr, int left, int right, int ind) {
        int temp = arr[ind][right];
        arr[ind][right] = arr[ind][left];
        arr[ind][left] = temp;
    }
}
