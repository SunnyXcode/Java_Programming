//Second-largest element
class Solution2{
    public int secondLargest(int nums[]){
        int len=nums.length;
        int max=nums[0];
        int second_max=Integer.MIN_VALUE;
        for(int i=1;i<len;i++){
            if(nums[i]>max){
                second_max=max;
                max=nums[i];
            }else if(nums[i]>second_max && nums[i]!=max){
                second_max=nums[i];

            }
        }
        return second_max;
    }
    public static void main(String args[]){
        Solution2 ob=new Solution2();
        int arr[]={1,2,4,7,7,5,8,8,2};
        System.out.println("Second largest element:"+ob.secondLargest(arr));
    }

}