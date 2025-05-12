package SinglyLinkedListLL;
import java.util.Scanner;

// Define the Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    
    }
}

// Define the LinkedList class
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
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertEnd(int data) {
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

    public void insertMiddle(int data, int pos) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else if (pos == 1) {
            newNode.next = head;
        } else {
            int count = 1;
            Node temp = head;
            while (count < pos - 1) {
                temp = temp.next;
                count++;
            }
            Node current = temp.next;
            temp.next = newNode;
            newNode.next = current;
        }
    }

    public void deleteStart() {
        if (head == null) {
            System.out.println("List is empty:");
        } else {
            head = head.next;
        }

    }

    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty:");
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void deleteAtPos(int pos){
        if(head==null){
            System.out.println("List is empty");
        }
        else if(pos==1)
        {
            head=head.next;//head.next==null nhi kr skte wrna baki sab link tut jayega
        }
        else{
            int count=1;
            Node temp=head;
            while(count<pos-1){
                temp=temp.next;
                count++;
            }
            Node current=temp.next;
            temp.next=current.next;
        }
    }

    public void reverse()
    {
        Node current=head;
        Node next=null;
        Node previous=null;
        while(current!=null){
            next=current.next;
            previous=current.next;
            previous=current;
            current=next;
        }
        
        head=previous;
    }
    
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner scanner = new Scanner(System.in);
      

        while (true) {

            System.out.println(
                    "\n1)Insert at beginning\n2)Insert at End\n3)Insert at middle\n4)Print the Linked List\n5)Create a Linked List\n6)Delete at start\n7)Delete at end\n8)Delete at any position\n9)Reverse|\n10)Exit");

            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the data to be inserted at the beginning");
                    int data1 = scanner.nextInt();
                    list.insertStart(data1);
                    break;

                case 2:
                    System.out.println("Enter the data to be inserted at the end");
                    int data2 = scanner.nextInt();
                    list.insertEnd(data2);
                    break;

                case 3:
                    System.out.println("Enter the data to inserted at middle");
                    int data3 = scanner.nextInt();
                    System.out.println("Enter the position to be insert:");
                    int pos = scanner.nextInt();
                    list.insertMiddle(data3, pos);

                    break;

                case 4:
                    System.out.println("Current Linked List is:");
                    list.printList();
                    break;

                case 5:
                    System.out.println("Enter the number of nodes:");
                    int numNodes = scanner.nextInt();

                    System.out.println("Enter node data:");

                    for (int i = 0; i < numNodes; i++) {

                        int data = scanner.nextInt();
                        list.addNode(data);
                    }
                    break;

                case 6:
                    list.deleteStart();

                    break;

                case 7:
                    list.deleteEnd();
                    break;

                case 8:
                System.out.println("Enter the position:");
                int pos2=scanner.nextInt();
                list.deleteAtPos(pos2);
                break;

                case 9:
                System.out.println("\nReverse Linked List");
                list.reverse();
                break;

                case 10:
                System.out.println("Exited");
                System.exit(0);
                break;

                default:
                    System.out.println("Inavlid Choice");
                    break;

            }
          
        }

    }
   
}