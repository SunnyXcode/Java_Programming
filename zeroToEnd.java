package SinglyLinkedListLL;
public class zeroToEnd {

    public int[] ZeroEnd(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

    
            for (int i = 0; i <= end; i++) {
                if (arr[i] == 0) {
                    int temp = arr[end];
                    arr[end] = arr[start];
                    arr[start] = temp;
                    end--;
                    start++;
                }
                else{
                    start++;
                }
            }

        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        zeroToEnd ob = new zeroToEnd();

        int arr[] = { 0, 0, 1, 0, 0, 12, 34, 4, 56, 6 };

        int result[] = ob.ZeroEnd(arr);

        printArray(result);
    }

}
