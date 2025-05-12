// Detecting the node where the loop started
package SinglyLinkedListLL;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList13 {
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

    public boolean detect() {
        Node fastPtr = head;
        Node slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (slowPtr == fastPtr) {
                return true;
            }
        }
        return false;
    }


    public Node startingNode() {
        Node fastPtr = head;
        Node slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (slowPtr == fastPtr) {
                return getStartingNode(slowPtr);
            }
            
        }
        return null;
       
    }

    public Node getStartingNode(Node slowPtr) {
        Node temp = head;

        while (temp != slowPtr) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        return temp;

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void createALoop() {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next=third;

    }
}

public class detectLoopNode {
    public static void main(String[] args) {
        LinkedList13 list = new LinkedList13();

        list.createALoop();

        if (list.detect() == true) {
            Node result = list.startingNode();
            System.out.println("List contains a loop and it starts at" +" "+ result.data);
        } else {
            System.out.println("List doesn't contains a loop");
        }

    }

}
