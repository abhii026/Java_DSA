import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int [] arr={1,4,3,2,5};
        System.out.print("Before swap:");
        System.out.println(Arrays.toString(arr));
        swap(arr,1,3);
        System.out.print("After swap:");
        System.out.print(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
