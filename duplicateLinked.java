package SinglyLinkedListLL;
public class duplicateLinked {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to remove duplicates from the linked list
    void removeDuplicates() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    // Method to print the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        duplicateLinked list = new duplicateLinked();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(1);
        list.head.next.next.next = new Node(3);
        list.head.next.next.next.next = new Node(4);
        list.head.next.next.next.next.next = new Node(3);
        list.head.next.next.next.next.next.next = new Node(5);

        System.out.println("Original List: ");
        list.printList();

        list.removeDuplicates();

        System.out.println("List after removing duplicates: ");
        list.printList();
    }
}