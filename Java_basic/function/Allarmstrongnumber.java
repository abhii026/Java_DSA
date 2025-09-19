public class Allarmstrongnumber {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        for (int i = 1; i <1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }
    static boolean isArmstrong(int n) {
        int original = n, sum=0, digit=0,temp=n;
        while (temp>0) {
            temp/=10;
            digit++;
        }
        while (n>0) {
            int rem = n%10;
            sum = sum + (int)Math.pow(rem, digit);
            n = n/10;
        }
        return (original == sum);
    }
}
