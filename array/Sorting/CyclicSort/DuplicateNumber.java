public class DuplicateNumber {
    public static void main(String[] args) {
        // int[] arr = { 1, 3, 4, 2, 2 };
        // int[] arr = { 3, 1, 3, 4, 2 };
        int[] arr = { 3, 3, 3, 3, 3 };
        int res = dublicate(arr);
        System.out.println(res);
    }

    static int dublicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[correct] != arr[i]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

}
