package SinglyLinkedListLL;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    Node head;

    public void CreateNode(int data) {
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

    public Node nthNode(int pos) {
        Node mainPtr = head; // Initialize mainPtr to head
        Node refPtr = head; // Initialize refPtr to head
        int count = 1;
        while (count < pos) {
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr.next != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;

    }

}

public class nthListfromEnd {

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();

        list.CreateNode(4);
        list.CreateNode(3);
        list.CreateNode(3);
        list.CreateNode(2);

        Node result = list.nthNode(2);
        if (result != null) {
            System.out.println("Data at nth position from end :"+result.data);
         
        } else {
            System.out.println("Node not found");
        }

    }

}


