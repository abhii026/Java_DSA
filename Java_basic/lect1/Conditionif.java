import java.util.Scanner;

public class Conditionif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num == 10) {
            System.out.println("Condition is true!");
        } else {
            System.out.println("Condition is false!");
        }
    }
}
