package Searching;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {

    public int binarySearch(int arr[],int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(key<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
        
    }

    public static void main(String[] args) {
        BinarySearch ob=new BinarySearch();
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the elemnts to search:");
        int key=sc.nextInt();

        int result=ob.binarySearch(arr, key);

        if(result==-1){
            System.err.println("Key is not present:");
        }
        else{
            System.out.println("key found at "+result);
        }
    }
    
}
