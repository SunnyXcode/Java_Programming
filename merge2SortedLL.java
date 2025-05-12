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

public class merge2SortedLL {
    public static Node mergeLists(Node a, Node b) {
        Node dummyNode = new Node(0);
        Node currentNode = dummyNode;

        while (a != null && b != null) {
            if (a.data < b.data) {
                currentNode.next = a;
                a = a.next;
            } else {
                currentNode.next = b;
                b = b.next;
            }
            currentNode = currentNode.next;
        }

        if (a != null) {
            currentNode.next = a;
        } else if (b != null) {
            currentNode.next = b;
        }

        return dummyNode.next;
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

        Node mergedHead = mergeLists(list1.head, list2.head);
        LinkedList mergedList = new LinkedList();
        mergedList.head = mergedHead;

        System.out.println("Merged List:");
        mergedList.printList();
    }
}