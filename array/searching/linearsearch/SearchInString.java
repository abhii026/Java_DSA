public class SearchInString {
    public static void main(String[] args) {
        String name="Abhishek";
        char target='i';
        System.out.println(StringSearch(name,target));

    }
    static boolean StringSearch(String str,char value){
        if (str.length()==0) {
            return false;
        }
        else{
            for(int i=0; i<str.length(); i++){
                if (str.charAt(i)==value) {
                    return true;
                }
            }
        }
        return false;
    }
}
