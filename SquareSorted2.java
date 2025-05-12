package Sorting;
class SquareSorted2 {
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
        int temp[]=new int[len];
        int i=0,j=len-1;
        for(int k=len-1;k>=0;k--){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                temp[k]=nums[i]*nums[i];
                i++;
            }
            else{
                temp[k]=nums[j]*nums[j];
                j--;
            }
        }
        return temp;
        
    }

    public static void main(String[] args) {
        SquareSorted2 ob=new SquareSorted2();
        int nums[]={-4,-1,0,3,10};
        int result[]=ob.sortedSquares(nums);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }

    }
}