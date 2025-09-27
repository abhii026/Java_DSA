public class Ceiling_no {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 19;
        int ans = Bs_ceiling(arr, target);
        System.out.println(ans);
    }

    static int Bs_ceiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int last = arr.length - 1;
        while (start <= last) {
            int mid = start + (last - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return arr[start];
    }
}
