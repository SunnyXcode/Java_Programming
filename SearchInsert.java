package Searching;
import java.util.Scanner;
public class SearchInsert {

    public int searchInsert(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
       return low;
    }

    public static void main(String[] args) {
        SearchInsert ob=new SearchInsert();
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];
        System.out.println("Enter the array elements:");// arr={1,2,3,4,5} target=0 ,, where can 0 be inserted so that sorted order is not disturbed
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target=sc.nextInt();

        int result=ob.searchInsert(arr, target);

      System.out.println("Target can be inserted at index "+result);
    }
    
}
