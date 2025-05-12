package Stack;
import java.util.Stack;
public class StringReverseStack {

   public String stringReverse(String str){
    Stack<Character> stack=new Stack<Character>();
    char[] chars=str.toCharArray();

    for(char c:chars){
        stack.push(c);
    }

    String rev="";

    for(int i=0;i<str.length();i++){
        rev=rev+stack.pop();
        
    }
    return rev;

   }

   public static void main(String[] args) {
    StringReverseStack rev=new StringReverseStack();

    String reverse=rev.stringReverse("Rohit");

    System.out.println(reverse);
   }

    
}
