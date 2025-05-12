package Sorting;
public class MergeSort{
    public void sort(int arr[],int temp[],int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            sort(arr,temp,low,mid);
            sort(arr,temp,mid+1,high);
            merge(arr,temp,low,mid,high);
        }
        
    }

    
    public void merge(int arr[], int temp[], int low, int mid, int high) {
        // Copy the input array to the temporary array
        for (int i = low; i <=high; i++) {
            temp[i] = arr[i];
        }
    
        int i = low, j = mid + 1, k = low;
    
        // Merge the two subarrays
        while (i <= mid && j <= high) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
    
        // Copy any remaining elements from the first subarray
        while (i <= mid) {
            arr[k] = temp[i];
            i++;
            k++;
        }
    
        // Copy any remaining elements from the second subarray
        while (j <= high) {
            arr[k] = temp[j];
            j++;
            k++;
        }
    }
        
    
    public static void main(String args[]){
        MergeSort ob=new MergeSort();
        int arr[]={2,3,4,1,5,7,2};

        int temp[]=new int[arr.length];
        int low=0;
        int high=arr.length-1;

       ob.sort(arr,temp,low,high);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}