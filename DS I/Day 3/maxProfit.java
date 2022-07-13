class Solution {
    public int maxProfit(int[] prices) {
        int i,min=prices[0],max=0;
        for(i=1;i<prices.length;i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
                
            }
            if(prices[i]-min > max){
                 max=prices[i]-min;
            }
        }
        return max;
        
    }
}