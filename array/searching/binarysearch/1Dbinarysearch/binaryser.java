// It work on sorted array.
// best complexity is O(1) and worst is o(logn).

import java.util.Scanner;

public class binaryser {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // System.out.print("Enter the size of the array: ");
        // int size=in.nextInt();
        // int[] arr1= new int[size];
        // System.out.print("Enter elements in array: ");
        // for (int i = 0; i < size; i++) {
        //     arr1[i]=in.nextInt();
        // }
        // System.out.print("Enter target value: ");
        // int target= in.nextInt();
        int[] arr={10,20,30,40,50,99};
        int target=99;
        int result=binarysearch(arr,target);
        System.out.println(result);
        
    }
    static int binarysearch(int[] arr, int value){
        int start= 0;
        int end = arr.length-1;
        while (end>=start) {
            int mid=start+(end-start)/2;
            if(value>arr[mid]){
                start=mid+1;
            }
            else if (value<arr[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
