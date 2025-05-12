package Array;
public class minArray {

    public static int min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        minArray ob=new minArray();
        int arr[]={3,5,3,5,7,2,3,1,-9};

        System.out.println(ob.min(arr));
    }
}
