package Sorting;
import java.util.Scanner;
public class exam {
    public static void main(String[] args) {
        exam ob=new exam();
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];

         for(int i=0;i<5;i++){
            if(i<3){
            arr[i]=sc.nextInt();
            }
         }

         for(int i=0;i<5;i++){
           System.out.print(arr[i]+" ");
         }
        
        
    }
    
}
