package Sorting;

public class reArrange {
    public int[] arrange(int arr[]) {
        int len = arr.length;
        int result[] = new int[len];
        int i = 0;
        int j = len - 1;
        int k;
     for(k=0;k<len;k++){
        if(k%2==0){
            result[k]=arr[j];
            j--;

            }else{
            result[k]=arr[i];
            i++;

            }
     }
        return result;
    }

    public static void main(String[] args) {
        reArrange ob = new reArrange();
        int arr[] = {1, 2, 3, 4, 5};
        int out[] = ob.arrange(arr);
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + " ");
        }

    }
}
