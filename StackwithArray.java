package Stack;

public class StackwithArray {
    int top;
    int arr[];

    class Stack{
        int data;
        int size;

        Stack(int data){
            this.data=data;
        }
    }

    public StackwithArray(int size){
        top=-1;
        arr=new int[size];
    }

    public void push(int data){
        if(isFull()){
            return;
        }
        else{
            top++;
            arr[top]=data;
        }
    }

    public void pop(){
        top--;
    }

    public int size(){
        return top+1;
    }

    public boolean isFull(){
        return arr.length==size();
    }

    public void printStack(){
        for(int i=top;i>-1;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        StackwithArray array = new StackwithArray(5);

        array.push(5);
        array.push(4);
        array.push(3);
        array.push(2);
        array.push(1);

       

        array.pop();

        array.printStack();



        
    }
    
}
