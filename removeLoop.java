// Detecting the node where the loop started
package SinglyLinkedListLL;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
     

    }
}

class LinkedListLL {
    Node head;

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

    public void removeStartingNode() {
        Node fastPtr = head;
        Node slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (slowPtr == fastPtr) {
                remove(slowPtr);

            }

        }

    }

    public void remove(Node slowPtr) {
        Node temp = head;

        while (temp != slowPtr) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;

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
        fifth.next = third;

    }
}

public class removeLoop {
    public static void main(String[] args) {
        LinkedListLL list = new LinkedListLL();

        list.createALoop();

        if(list.detect()==true){
            list.removeStartingNode();
            System.out.println("List after removing the loop");
            list.printList();
        }
        else{
            System.out.println("List doesn't contain a loop");
        }

        

    }

}
