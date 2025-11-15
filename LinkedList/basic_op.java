
import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
};

public class basic_op {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        // Node head = new Node(0);
        // head.next = new Node(1);
        // head.next.next = new Node(2);
        // head.next.next.next = new Node(3);
        System.out.print("Enter size of node: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Enter data: ");
            int value = sc.nextInt();
            head = insertAtend(head, value);
        }
        // System.out.print("Before: ");
        display(head);
        // System.out.print("Enter the value: ");
        // int x=sc.nextInt();
        // head=insertAtend(head, x);
        // System.out.print("After: ");
        // display(head);
        // head = insertAtBeginning(head);

    }

    static Node insertAtend(Node head, int data) {
        Node new_node = new Node(data);
        if (head == null) {
            return new_node;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
        return head;

    }
    static Node insertAtBeginning(Node head, int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        return new_node;
    }

    static void display(Node head) {

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
