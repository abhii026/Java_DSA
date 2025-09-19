import java.util.Scanner;
public class temprature {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.print("Enter temperature in Celsius(°C)= ");
        float Celsius= n.nextFloat();
        float Fahrenheit=(Celsius*9/5)+32;
        System.out.println("Fahrenheit (°F) is: "+Fahrenheit);
    }
}
