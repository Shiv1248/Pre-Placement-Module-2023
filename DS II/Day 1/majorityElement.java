class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int count = 1;
        Arrays.sort(nums);
        for(int j = 1; j < nums.length; ++j){
            if(nums[j-1]==nums[j]) count++;
            else count = 1;
            if(count > nums.length/2){
                return nums[j];
            }
        }
        return -1;
    }
}