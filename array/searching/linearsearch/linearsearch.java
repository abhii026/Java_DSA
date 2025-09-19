public class linearsearch {
    public static void main(String[] args) {
        int[] arr={18,12,9,14,77,50};
        int value=50;
        linear_search(arr,value);

    }
    static void linear_search(int[] arr,int value){
        int key=0;
        int result=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==value){
                key=i;
                result=1;
            }
        }
        if (result==1) {
            System.out.println("The value "+value+" is found at index "+key+ ".");                
        }
        else{
            System.out.println("The value " + value + " is not found in the array.");
        }
    }
}