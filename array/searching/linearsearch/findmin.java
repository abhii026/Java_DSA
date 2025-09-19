public class findmin {
    public static void main(String[] args) {
        int[] arr={18,12,7,3,14,28};
        int res=min_number(arr);
        System.out.println(res);
    }
    static int min_number(int[] num){
        if (num.length==0) {
            return -1;
        }
        int min=num[0];
        for(int i=0; i<num.length; i++){
            if (min>num[i]) {
                min=num[i];
            }
        }
        return min;
        
    }
}
