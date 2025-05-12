package Array;
public class secondMinimum{

    public int secondMin(int arr[]){
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secondMin=min;
                min=arr[i];
            }
            else if(arr[i]<secondMin && arr[i]!=min){
                secondMin=arr[i];
            }
        }
        return secondMin;
    }
    public static void main(String[] args) {
        secondMinimum ob=new secondMinimum();

        int arr[]={1,2,3,4,5,6,7,8,8,8};

        System.out.println(ob.secondMin(arr));
    }
    
}
