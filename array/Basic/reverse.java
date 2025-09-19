
public class reverse {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        reverse(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
