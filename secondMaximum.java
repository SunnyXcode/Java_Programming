package Array;
public class secondMaximum {

    public int secondMax(int arr[]){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        secondMaximum ob=new secondMaximum();

        int arr[]={1,2,3,4,5,6,7,8,8,8};

        System.out.println(ob.secondMax(arr));
    }
    
}
