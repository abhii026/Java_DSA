import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        // list.add(5);
        // list.add(6);
        // list.add(59);
        // list.add(8);
        // list.add(78);
        // System.out.println(list);
        // System.out.println(list.contains(45)); //check the value present or not.
        // System.out.println(list.contains(5));
        // list.set(0, 892);// change the value at specifing index.
        // System.out.println(list);
        // list.remove(2);// remove the value.
        // System.out.println(list);
        System.out.print("Enter elements: ");
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println("Print elements: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
