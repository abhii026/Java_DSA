// import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 999, 34, 56 },
                { 18, 12, 875 }
        };
        int target = 56;
        int[] res = Search_min(arr, target);
        System.out.print("Target value is at index:");
        System.out.println(Arrays.toString(res));
        int ans = max_value(arr);
        System.out.println("Maximum value in the 2D array is: " + ans);

    }

    static int[] Search_min(int[][] num, int value) {
        // if(num.length==0){
        // return -1;
        // }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] == value) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max_value(int[][] num) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] > max) {
                    max = num[i][j];
                }
            }
        }
        return max;
    }
}
