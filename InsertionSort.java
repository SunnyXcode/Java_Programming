package Sorting;


import java.util.Scanner;
public class InsertionSort {

    public int[] insertionSort(int arr[]){
      for(int i=1;i<arr.length;i++){
        int temp=arr[i];
        int j=i-1;

        while(j>=0 && arr[j]>temp){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=temp;
      }
      return arr;
    }

    public int[] SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;

        }
        return arr;

    }

    public static void main(String[] args) {
        InsertionSort ob=new InsertionSort();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       

       // int result[]=ob.insertionSort(arr);
        int result[]=ob.SelectionSort(arr);

       for(int i=0;i<result.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
    
}
