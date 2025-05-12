package Sorting;

public class Merge2SortedArray {

    public int[] mergeArray(int arr1[],int arr2[]){
        int l1=arr1.length;
        int l2=arr2.length;
        int l3=l1+l2;
        int result[]=new int[l3];

        int i=0,j=0,k=0;

        while(i<l1 && j<l2){
            if(arr1[i]<arr2[j]){
                result[k]=arr1[i];
                i++;
            }
            else{
                result[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<l1){ // if arr2 gets exhausted
            result[k]=arr1[i];
            i++;
            k++;
        }
        while(j<l2){ //if arr1 gets exhausted
            result[k]=arr2[j];
            j++;k++;
        }

        
        return result;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        int length=m+n;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        while(i>=0){
            nums1[k]=nums1[i];
            i--;
            k--;
        }
        for(int x=0;i<length;i++){
            System.out.print(nums1[x]+" ");
        }
        
    }

    public static void main(String[] args) {
        
        Merge2SortedArray ob=new Merge2SortedArray();
        int arr1[]={1,5,9};
        int arr2[]={1,2,6};

        //int result[]=ob.mergeArray(arr1,arr2);
        ob.merge(arr1, 3, arr2, 3);

       // for(int i=0;i<result.length;i++){
           // System.out.print(result[i]+" ");
        }
    }
    

