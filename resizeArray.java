package Array;
public class resizeArray {

    public int[] resize(int arr[], int capacity) {//original arr={1,2,3,4}
        int temp[] = new int[capacity];           //temp arr={1,2,3,4,0,0,0,0}
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
                                                             
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
        }
 
     }

     public static void main(String[] args) {
        resizeArray ob = new resizeArray();

        int arr[]={1,2,3,4};
        int capacity=8;

        int result[]=ob.resize(arr, capacity);
        System.out.println("Resized Array:");
        printArray(result);
     }

}
