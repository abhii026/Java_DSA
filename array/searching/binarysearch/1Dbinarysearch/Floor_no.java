public class Floor_no {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 1;
        int ans = Bs_floor(arr, target);
        System.out.println("Floor of Number is: " + ans);
    }

    static int Bs_floor(int[] arr, int target) {
        if (target < arr[0]) {
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
        return arr[last];
    }
}
