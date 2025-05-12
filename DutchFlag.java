package Sorting;

public class DutchFlag {

    public void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public void zeroOneTwo(int arr[]){
        int i=0,j=0,k=arr.length-1;
        while(i<=k){
           if(arr[i]==0){
            swap(arr,i,j);
            i++;
            j++;
            }
            else if(arr[i]==1){
                i++;
            }
            else if(arr[i]==2){
                swap(arr,i,k);
                k--;
            }
           }
        }

    
    public static void main(String[] args) {
        DutchFlag ob=new DutchFlag();
        int arr[]={2,0,0,0,1,1,1};

        ob.zeroOneTwo(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
