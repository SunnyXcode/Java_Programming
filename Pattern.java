import java.util.*;
public class Pattern {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        int charIndex=Integer.valueOf(ch);
        System.out.println("Character Index:");
        System.out.println(charIndex);
        int endIndex=charIndex-6;

        
      for(int i=0;i<7;i++){
        for(int j=endIndex;j<=charIndex-i;j++){
            System.out.print((char)j);
        }

        for(int j=0;j<2*i-1;j++){
             System.out.print(" ");
        }

        for(int j=charIndex-i;j>=endIndex;j--){
            if(j!=charIndex){
                System.out.print((char)j);
            }
        }
        System.out.println();
      }
    }
}
    
    

