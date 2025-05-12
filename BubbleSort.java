package Sorting;
import java.util.Scanner;
public class BubbleSort {

    public int[] bubbleSort(int arr[]){
        boolean isSwapped;
        for(int i=arr.length-1;i>=0;i--){
            isSwapped=false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwapped=true;
                }
                }
                if(isSwapped==false){
                    break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort ob=new BubbleSort();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       

        int result[]=ob.bubbleSort(arr);

       for(int i=0;i<result.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
    
}
