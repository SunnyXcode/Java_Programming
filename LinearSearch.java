package Searching;
import java.util.Scanner;
public class LinearSearch {

    public int LinearSearching(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i ;
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch ob=new LinearSearch();
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elemnts to search:");
        int key=sc.nextInt();

        int result=ob.LinearSearching(arr, key);

        if(result==-1){
            System.err.println("Key is not present:");
        }
        else{
            System.out.println("key found at "+result);
        }
    }
    
}
