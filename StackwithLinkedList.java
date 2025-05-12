package Stack;

public class StackwithLinkedList {
    Node top;

    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }

    public StackwithLinkedList(){
        top=null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(top==null){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
    }

    public int pop(){
        if(top==null){
            return 0;
        }
        int result=top.data;
        top=top.next;

        return result;
    }

    public void printList(){
        if(top==null){
            return;
        }
        while(top!=null){
            System.out.print(top.data+"-->");
            top=top.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        StackwithLinkedList stack=new StackwithLinkedList();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        int result=stack.pop();

        stack.printList();
        System.out.println("Deleted element:"+result);
       
    }
}
