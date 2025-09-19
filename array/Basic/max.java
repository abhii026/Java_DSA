
public class max {
    public static void main(String[] args) {
        int [] arr={1,4,3,25,5};
        max(arr);
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max_value=arr[0];
        for(int i=0; i<5;i++){
            if(arr[i]>max_value){
                max_value=arr[i];
            }
        }
        return max_value;
    }

}
