package Array;
import java.util.Scanner;

public class removeEven{
    
    private int size;

    removeEven(int size){
        this.size=size;
        
    }

    public int[] removeEVEN(int arr[]){
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int idx=0;
        int oddArray[]=new int[oddCount];
        for(int i=0;i<size;i++){
            if(arr[i]%2!=0){
                oddArray[idx]=arr[i];
                idx++;
            }
        }
        return oddArray;
    }

    public static void printArray(int arr[]){
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }

    }

    public static void main(String args[]){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        removeEven ob=new removeEven(size);

        int arr[]=new int[size];

        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
        {
             arr[i]=sc.nextInt();
        }
         int result[]= ob.removeEVEN(arr);

         System.out.println("Array after removing even numbers");

         printArray(result);
    }
}
