import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class agecalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input: Date of Birth
        System.out.print("Enter your birth year (YYYY): ");
        int year = in.nextInt();
        System.out.print("Enter your birth month (MM): ");
        int month = in.nextInt();
        System.out.print("Enter your birth day (DD): ");
        int day = in.nextInt();

        // DOB and Current Date
        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate currentDate = LocalDate.now();

        if (dob.isAfter(currentDate)) {
            System.out.println("Invalid DOB: Birth date is in the future!");
        } else {
            Period age = Period.between(dob, currentDate);
            System.out.println("Your age is: " + age.getYears() + " years, " + 
                                                age.getMonths() + " months, " + 
                                                age.getDays() + " days.");
        }
    }
}
