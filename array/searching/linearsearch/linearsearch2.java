import java.util.Scanner;

public class linearsearch2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=in.nextInt();
        int[] arr= new int[size];
        System.out.print("Enter the elements in array: ");
        for(int index=0; index<size; index++){
            arr[index]=in.nextInt();
        }
        System.out.print("Enter the target element of array: ");
        int target_value=in.nextInt();
        int result=linear_search(arr,size,target_value);
        System.out.println(result);

    }
    static int linear_search(int[] num, int size,int value){
        if (num.length==0) {
            return -1;
        }
        else{
            for(int i=0; i<size;i++){
                if (num[i]==value) {
                    return i;
                }
            }
        }
        return -1;
    }
}
