package Queue;

public class QueueOp {
    Node front;
    Node rear;
    int length;

    public QueueOp() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (length == 0) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public void dequeue(){
        if (length == 0) {
            return;
        }
        front = front.next;
         if(front==null){ // This is necessary as we have to break both front and rear link
            rear=null;//this statement breaks rear link to delete the last element otherwise the element will not be deleted
        }
        length--;
    }

    public void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        QueueOp queue = new QueueOp();

        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        

        queue.printQueue();

    }
}
