import java.util.*;

public class NaviPattern{

    public static void main(String[] arg){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = in.next();

        System.out.print("Enter Pattern: ");
        String p = in.next();

        int n = s.length();
        int m = p.length();

        int res = Navi(s, p, n, m);

        System.out.println("\nTotal matches: " + res);
    }

    static int Navi(String s, String p, int n, int m){

        int ans = 0;

        for(int i = 0; i <= n - m; i++){

            int j;

            for(j = 0; j < m; j++){

                if(s.charAt(i + j) != p.charAt(j)){
                    break;
                }
            }

            if(j == m){
                System.out.print(i + " ");
                ans++;
            }
        }

        return ans;
    }
}