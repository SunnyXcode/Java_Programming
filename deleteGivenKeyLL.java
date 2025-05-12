package SinglyLinkedListLL;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;

    }
}

class LinkedList11 {
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

    public void deleteKey(int data) {
        Node current = head;
        Node previous = null;

        if (current.next != null && current.data == data) { // if first data matches
            head = current.next;
        }

        while (current.next != null && current.data != data) { // if data matches after first one
            previous = current;
            current = current.next;
        }
        previous.next = current.next;

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

public class deleteGivenKeyLL {
    public static void main(String[] args) {
        LinkedList11 list = new LinkedList11();

        list.createNode(1);
        list.createNode(2);
        list.createNode(3);
        list.createNode(5);
        list.createNode(11);

        System.out.println("List before deleting");
        list.printList();

        System.out.println("List after deleting");
        list.deleteKey(5);
        list.deleteKey(11);
        list.printList();
    }

}
