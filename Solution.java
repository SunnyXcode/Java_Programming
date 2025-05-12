class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                index=i;
            }
            else if(prices[i]>min){
                index=i-1;
                break;
            }

        }
        System.out.println("Index="+index);

        for(int j=index+1;j<prices.length;j++){
            if(prices[j]>max){
                max=prices[j];
            }
        }

        System.out.println("Max="+max);
        System.out.println("Min="+min);

        if(max<0){
            return 0;
        }
        else{
            return max-min;
        }
    }
    public static void main(String[] args) {
        Solution ob =new Solution();
        int arr[]={7,6,4,3,1};//7,6,4,3,1 //7,1,5,3,6,4]
        
       int result=ob.maxProfit(arr);
       System.out.println(result);
    
    }
}