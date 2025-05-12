package SinglyLinkedListLL;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList3 {
    Node head;

    public void createNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertSorted(int data) {
        Node newNode = new Node(data);
        Node current = head;
        Node previous = null;
        while (current.next != null && current.data < newNode.data) {
            previous = current;
            current = current.next;
        }
        previous.next = newNode;
        newNode.next = current;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class insertInSortedLL {
    public static void main(String[] args) {
        LinkedList3 list = new LinkedList3();

        list.createNode(1);
        list.createNode(2);
        list.createNode(3);
        list.createNode(5);
        list.createNode(11);

        System.out.println("List before inserting in sorted Linked List");
        list.printList();

        list.insertSorted(10);
        list.insertSorted(4);

        System.out.println("List after inserting in sorted Linked List");
        list.printList();
    }

}
