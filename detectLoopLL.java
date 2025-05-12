package SinglyLinkedListLL;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        

    }
}

class LinkedList12 {
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

  public boolean detect(){
    Node fastPtr=head;
    Node slowPtr=head;

    while(fastPtr!=null && fastPtr.next!=null){
        fastPtr=fastPtr.next.next;
        slowPtr=slowPtr.next;

        if(slowPtr==fastPtr){
            return true;
        }
    }
    return false;
  }

 

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void createALoop(){
        Node first=new Node(1);
        Node second=new Node(1);
        Node third=new Node(1);
        Node fourth=new Node(1);
        Node fifth=new Node(1);

        head=first;
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        
    }
}

public class detectLoopLL {
    public static void main(String[] args) {
        LinkedList12 list = new LinkedList12();

        list.createALoop();

        if(list.detect()==true){
            System.out.println("List contains loop");
        }
        else{
            System.out.println("List doesn't contains loop");
        }

   

    }

}
