class Solution {
    public int[] productExceptSelf(int[] nums) {
         int length = nums.length;
        int product = 1;               
        int [] result = new int[length]; 
        
        result[0] = nums[0];
        for(int i =1; i<length; i++){
            result[i] = nums[i]*result[i-1]; 
        }
        
        
        
        result[length-1] = result[length-2];  
        product = nums[length-1]; 
        
        for(int i = length-2; i>=1; i--){
            result[i] = result[i-1]*product; 
            product = product*nums[i];
        }
        result[0] = product; 
        
        return result;
    }
}