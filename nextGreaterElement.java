package Stack;
import java.util.Stack;
public class nextGreaterElement {

    public int[] nextGreater(int arr[]){
        Stack<Integer> stack =new Stack<>();
        int result[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i]=-1;
            }
            else{
                result[i]=stack.peek();
            }
            stack.push(arr[i]);

        }
     
        
        return result;
    }
    public static void main(String[] args) {
        nextGreaterElement ob=new nextGreaterElement();
       

        int arr[]={4,7,3,4,8,1};

       int result[]= ob.nextGreater(arr);

        for(int num:result){
            System.out.print(num+",");
        }
    }
}
