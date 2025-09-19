import java.util.Arrays;

public class jeet {
    public static void main(String[] args) {
        int[] arr = { 9};
        int last = arr.length - 1;
        for (int i = 0; i <= arr.length; i++) {
            if (i == last) {
                arr[i] += 1;
                // System.out.println(arr[last]);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
