package Sorting;

public class SquareSorted {
    public int[] Square(int arr[]){
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            arr[i]=temp*temp;
        }
        return arr;
    }

public void squareSorted(int arr2[],int temp[],int low,int high){
    if(low<high){
        int mid=low+(high-low)/2;
        squareSorted(arr2,temp,low,mid);
        squareSorted(arr2,temp,mid+1,high);
        merge(arr2,temp,low,mid,high);
    }

}

public void merge(int arr2[],int temp[],int low,int mid,int high){
    for(int i=low;i<=high;i++){
        temp[i]=arr2[i];
    }
    int i=low,j=mid+1,k=low;
    while(i<=mid && j<=high){
        if(temp[i]<=temp[j]){
            arr2[k]=temp[i];
            i++;
        }
        else{
            arr2[k]=temp[j];
            j++;
        }
        k++;
    }
    while(i<=mid){
        arr2[k]=temp[i];
        k++;
        i++;

    }
}

    public static void main(String[] args) {
        SquareSorted ob=new SquareSorted();
        int arr[]={1,2,3,4};
       int arr2[]= ob.Square(arr);
       int low=0;
       int high=arr.length-1;

       ob.squareSorted(arr2,new int[arr.length],low,high);

       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
    
}
