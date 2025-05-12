package SinglyLinkedListLL;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void addNode(int data) {
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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class addTwoLL {

    public static Node addLL(Node a, Node b) {
        Node dummy = new Node(0);
        Node tail = dummy;

        int carry = 0;
        while (a != null || b != null) {
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;

            int sum = carry + x + y;// if sum is 12
            carry = sum / 10;// 12/10=1 will go to carry
            tail.next = new Node(sum % 10);// 12%10=2 will go to tail.next
            tail = tail.next;
            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }

        if (carry > 0) {
            tail.next = new Node(carry);
        }

        return dummy.next;

    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addNode(1);
        list1.addNode(3);
        list1.addNode(5);

        LinkedList list2 = new LinkedList();
        list2.addNode(2);
        list2.addNode(4);
        list2.addNode(6);

        System.out.println("List 1:");
        list1.printList();

        System.out.println("List 2:");
        list2.printList();

        Node addHead = addLL(list1.head, list2.head);

        LinkedList addList = new LinkedList();

        addList.head = addHead;

        System.out.println("Linked List after summation:");
        addList.printList();

    }
}