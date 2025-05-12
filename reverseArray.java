package Array;
public class reverseArray {
   int[] reverse(int arr[])
   {
    int end=arr.length-1;
    int start=0;

    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;    
    }
    return arr;
   }

   public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
     System.out.print(arr[i]+" ");
    }
}

public static void main(String args[]){
    reverseArray obj=new reverseArray();
    int arr[]={1,2,3,4,5};

    System.out.println("Reversed array:");

    int result[]=obj.reverse(arr);
    printArray(result);
     


}

}


