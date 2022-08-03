class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int size=nums.length;
        int left=0;
        int right=0;
        int sum=0;
        int shortest= Integer.MAX_VALUE;
        while(right<size){
            sum+=nums[right];
            if(sum>=target){
               while(sum>=target){
                sum-=nums[left];
                left++; 
               }
            shortest= Math.min(shortest,right-left+2);
            }
            right++;
        }
        return shortest==Integer.MAX_VALUE?0:shortest;
    }
}