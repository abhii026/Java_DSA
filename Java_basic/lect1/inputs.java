import java.util.Scanner;;

public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your rollno: ");
        int rollno = input.nextInt();
        input.nextLine();
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println(name + " your rollno is " + rollno + "."); ;
    }
}

// import java.util.Scanner;

// public class inputs {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter your rollno: ");
//         int rollno = input.nextInt();
//         input.nextLine(); // consume the leftover newline

//         System.out.print("Enter your name: ");
//         String name = input.nextLine();

//         System.out.println(name + ", your rollno is " + rollno);
//     }
// }
