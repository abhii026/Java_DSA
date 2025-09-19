import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1=input.nextInt();
        System.out.print("Enter number2: ");
        int num2=input.nextInt();
        int sum=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num1/num2;
        System.out.println("Sum="+sum);
        System.out.println("differnce="+sub);
        System.out.println("multiply="+mul);
        System.out.println("divide="+div);
    }
}
