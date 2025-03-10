class Solution {
    public int rob(int[] nums) {
         int n = nums.length; 
        
        if(n == 1) return nums[0];
        
        int[] cache = new int[n]; 
        
        cache[0] = nums[0];
        cache[1] = Math.max(nums[0], nums[1]);
        
        int i=2;
        
        while(i < n) {
            int curVal = nums[i];
            cache[i] = Math.max(curVal + cache[i-2], cache[i-1]);
            i++;
        }
        return cache[n-1];
    }
}