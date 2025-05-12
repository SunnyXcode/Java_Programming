package Stack;
import java.util.Stack;
public class validParenthesis {
    
    public boolean valid(String str){
        Stack<Character> stack=new Stack<>();
        for(char ch :str.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top=stack.peek();
                    if(ch==')' && top=='('||ch=='}'&& top=='{'||ch==']'&& top=='['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        validParenthesis stack =new validParenthesis();

        String str="{()}";

        boolean bool=stack.valid(str);

        if(bool){
            System.out.println(str+" is a Valid Parenthesis");
        }
        else{
            System.out.println(str+" is an Invalid Parenthesis");
        }
    }
}
